SELECT * FROM books;         -- Check my connection with database

SELECT count(*) FROM book_borrow
WHERE is_returned = 0;       -- "0" is false/currently borrowed



