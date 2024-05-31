import express from "express";
import EditorController from "../controllers/editorController.js";

const routes = express.Router();

routes.get("/editors", EditorController.listEditors);
routes.get("/editors/:id", EditorController.listEditorFromId);
routes.post("/editors", EditorController.createEditor);
routes.put("/editors/:id", EditorController.updateEditor);
routes.delete("/editors/:id", EditorController.deleteEditor);

export default routes;
