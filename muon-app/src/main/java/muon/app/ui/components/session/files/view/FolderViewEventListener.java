package muon.app.ui.components.session.files.view;

import muon.app.common.FileInfo;

import javax.swing.*;

public interface FolderViewEventListener {
    void addBack(String path);

    void render(String path);

    void render(String path, boolean useCache);

    void openApp(FileInfo file);

    boolean createMenu(JPopupMenu popupMenu, FileInfo[] files);

    void install(JComponent c);

    void reload();
}
