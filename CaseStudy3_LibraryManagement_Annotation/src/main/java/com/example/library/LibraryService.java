package com.example.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // Make sure this is OUTSIDE the class
public class LibraryService {

    @Autowired
    private Book book;

    @Autowired
    private Member member;

    @Autowired
    private Loan loan;

    public void operate() {
        book.addBook();
        member.registerMember();
        loan.issueBook();
        loan.returnBook();
        member.viewMembers();
        book.searchBook();
    }
}
