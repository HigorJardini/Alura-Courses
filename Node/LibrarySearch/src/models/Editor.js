import mongoose from "mongoose";

const editorSchema = new mongoose.Schema(
  {
    id: { type: mongoose.Schema.Types.ObjectId },
    name: { type: String, required: true },
    country: { type: String },
  },
  { versionKey: false }
);

const editor = mongoose.model("editors", editorSchema);

export { editor, editorSchema };
