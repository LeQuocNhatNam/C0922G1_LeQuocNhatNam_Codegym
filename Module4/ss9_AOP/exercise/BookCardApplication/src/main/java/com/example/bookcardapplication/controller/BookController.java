package com.example.bookcardapplication.controller;

import com.example.bookcardapplication.model.Book;
import com.example.bookcardapplication.model.RentCard;
import com.example.bookcardapplication.service.IBookService;
import com.example.bookcardapplication.service.IRentCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IRentCardService rentCardService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("bookList",bookService.findAdd());
        return "index";
    }

    @GetMapping("/detail")
    public String showDetail(@RequestParam int id, Model model){
        model.addAttribute("book",bookService.findById(id));
        return "detail";
    }
    @GetMapping("/rent")
    public String rent(@RequestParam int bookRentId, Model model) throws Exception {
        if (bookService.findById(bookRentId).getQuantity() == 0){
            throw new Exception("not allowed");
        }
        int rentId = rentCardService.save(bookRentId);
        bookService.rent(bookRentId);
        model.addAttribute("message","Borrow successfully");
        model.addAttribute("rentId",rentId);
        return "success";
    }

    @GetMapping("/return")
    public String returnBook(@RequestParam int rentId, Model model) throws Exception {
        List<RentCard> rentCardList = rentCardService.findAll();
        for(RentCard rentCard : rentCardList){
            if (rentCard.getRentId() == rentId){
                Book book = bookService.findById(rentCard.getBookRentId());
                book.setQuantity(book.getQuantity() + 1);
                bookService.save(book);
                rentCardService.remove(rentCard.getId());
                model.addAttribute("message","return successfully");
                return "return_success";
            }
        }
        throw new Exception("wrong!");
    }
    @ExceptionHandler(Exception.class)
    public String handleException(){
        return "errors";
    }
}
