import express from "express";
import books from "./bookRoutes.js";
import editors from "./editorRoutes.js";

const routes = (app) => {
  app.use(express.json(), books, editors);
};

export default routes;
