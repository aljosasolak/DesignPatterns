# Exercises with Design Patterns

## 1. Memento Pattern
  Text editor where user can insert a value and the delete it by undoing it.
  Structure: Editor - EditorState - History

## 2. State patern
  Drawing application with three different states of cursor (BrushTool, SelectionTool, Eraser) Canvas class and Tool interface.
  Stopwatch app as an example of abuse of state pattern where the logic of the method click() which is supposed to change the state of the stopwatch (running <-> stopped) is spread out through many classes and an interface.
