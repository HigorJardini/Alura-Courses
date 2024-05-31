import book from "../models/Book.js";
import { editor } from "../models/Editor.js";

export default class BookController {
  static async listBooks(req, res) {
    try {
      const listBooks = await book.find({});
      res.status(200).json(listBooks);
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on list books` });
    }
  }

  static async listBookFromId(req, res) {
    try {
      const id = req.params.id;
      const listBook = await book.findById(id);
      res.status(200).json(listBook);
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on list books` });
    }
  }

  static async createBook(req, res) {
    const newBook = req.body;
    try {
      const editorSearch = await editor.findById(newBook.editor);
      const bookFinal = { ...newBook, editor: { ...editorSearch._doc } };
      const createdBook = await book.create(bookFinal);
      res.status(201).json({ message: "Create Book", book: createdBook });
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on create book` });
    }
  }

  static async updateBook(req, res) {
    try {
      const id = req.params.id;
      await book.findByIdAndUpdate(id, req.body);
      res.status(201).json({ message: `Update Book, Id: ${id}` });
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on update book` });
    }
  }

  static async deleteBook(req, res) {
    try {
      const id = req.params.id;
      await book.findByIdAndDelete(id, req.body);
      res.status(200).json({ message: `Delete Book, Id: ${id}` });
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on delete book` });
    }
  }

  static async listBookByPrice(req, res) {
    const pages = req.query.pages;
    try {
      const booksByPage = await book.find({ pages: pages });
      res.status(200).json(booksByPage);
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on list books` });
    }
  }
}
