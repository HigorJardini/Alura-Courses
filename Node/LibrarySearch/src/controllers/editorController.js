import { editor } from "../models/Editor.js";

export default class EditorController {
  static async listEditors(req, res) {
    try {
      const listEditors = await editor.find({});
      res.status(200).json(listEditors);
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on list editors` });
    }
  }

  static async listEditorFromId(req, res) {
    try {
      const id = req.params.id;
      const listEditor = await editor.findById(id);
      res.status(200).json(listEditor);
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on list Editors` });
    }
  }

  static async createEditor(req, res) {
    try {
      const newEditor = await editor.create(req.body);
      res.status(201).json({ message: "Create Editor", Editor: newEditor });
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on create Editor` });
    }
  }

  static async updateEditor(req, res) {
    try {
      const id = req.params.id;
      await editor.findByIdAndUpdate(id, req.body);
      res.status(201).json({ message: `Update Editor, Id: ${id}` });
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on update Editor` });
    }
  }

  static async deleteEditor(req, res) {
    try {
      const id = req.params.id;
      await editor.findByIdAndDelete(id, req.body);
      res.status(200).json({ message: `Delete Editor, Id: ${id}` });
    } catch (error) {
      res
        .status(500)
        .json({ message: `${error.message} - error on delete Editor` });
    }
  }
}
