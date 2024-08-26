package Lec3.Ex006.Interface;

import Lec3.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
