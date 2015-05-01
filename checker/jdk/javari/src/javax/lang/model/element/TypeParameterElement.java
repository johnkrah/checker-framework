package javax.lang.model.element;

import java.util.List;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.type.TypeVariable;

import org.checkerframework.checker.javari.qual.*;

public interface TypeParameterElement extends Element {
    @PolyRead Element getGenericElement(@PolyRead TypeParameterElement this);
    @PolyRead List<? extends TypeMirror> getBounds(@PolyRead TypeParameterElement this);
}
