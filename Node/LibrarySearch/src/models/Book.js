import mongoose from "mongoose";
import { editorSchema } from "./Editor.js";

const bookSchema = new mongoose.Schema(
  {
    id: { type: mongoose.Schema.Types.ObjectId },
    title: { type: String, required: true },
    price: { type: Number },
    pages: { type: Number },
    editor: editorSchema,
  },
  { versionKey: false }
);

const book = mongoose.model("books", bookSchema);

export default book;
