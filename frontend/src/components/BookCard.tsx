import {Book} from "../model/Book";
import React, {useState} from "react";

type bookCardProps ={
    book: Book
}

export default function BookCard({book}: bookCardProps){
    return <div>
        <div className={"BookCard"}>
            <div className={"BookTitle"}>{book.title}</div>
            <div className={"isbn"}>{book.isbn}</div>
        </div>
    </div>


}