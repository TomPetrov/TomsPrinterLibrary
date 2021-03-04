package LabelFactory.Elements.Abstracts;

import static LabelFactory.Elements.Abstracts.Anchorable.AnchorablePosition.topLeft;

public abstract class Anchorable {
    enum AnchorablePosition {
        topLeft(),
        topRight(),
        bottomLeft(),
        bottomRight(),
        center();

    }
    AnchorablePosition position = topLeft;
}
