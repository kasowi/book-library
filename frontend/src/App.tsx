import React from 'react';
import './App.css';
import BookOverview from './components/BookOverview';
import useBooks from "./hooks/useBooks";

export default function App() {

    const books = useBooks()

    if ( books === undefined) {
        return (
            <div>No books found</div>
        )
    }

    console.log(books);

  return (
    <div className="App">
      <header className="App-header">
      </header>
        <BookOverview books={books} />
    </div>
  );
}