# PrinterSDK

TODO:

LabelFactory with Interpreter

LabelFactory with Builder (bufferer/writer/interpolator)

The builder will receive language agnostic data in the form of appendable elements and references

The build function will receive args for printer lang, encoding etc

#
Element

This class will be extended by all label elements, with instances of Anchorable, Commandment, and others

#
Anchorable

The implementable, with Anchor var

Represents all printable elements
#
Anchor - Contains coords and anchor type

#
Anchor type - where the element is anchored such as top_left(default and only legible anchor for printer langs), center (useful for centering non static data), top_left(useful for rtl human langs)

Since printer langs don't have an anchor, this is to be eventually calculated by the sdk for the same position with the default top_left anchor

There are also anchor dynamics to consider in the future such as end_to_end, where the element doesn't have one xy coord for start, but it has one for each end of the element.

And also constraint anchors are an option (useful for human readables to non static data, consider implementing constraints as reference mentioned below)


wip...
