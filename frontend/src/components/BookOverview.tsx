import { Book } from "../model/Book";
import BookCard from "./BookCard";

type BookOverviewProps ={
    books : Book[]
}

export default function BookOverview({books}: BookOverviewProps) {


    return (
        <div className={"BookOverview"}>
            {books.map(obj => <BookCard book={obj}/>)}
        </div>
    )
}