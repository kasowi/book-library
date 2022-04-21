import {useEffect, useState} from "react";
import {Book} from "../model/Book";
import axios from "axios";


export default function useBooks() {

    const [books, setBooks] = useState<Book[]>();

    useEffect(() => {
        axios.get("http://localhost:8080/book-library")
            .then(response => {
                setBooks(response.data);
            });
    }, [])

    return books;

}