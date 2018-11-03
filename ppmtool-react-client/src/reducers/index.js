import { combineReducers } from "redux";
import ErrorReducer from "./ErrorReducer";
import projectReducer from "./projectReducer";

export default combineReducers({
  errors: ErrorReducer,
  project: projectReducer
});
