import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;

    private Folder parentFolder;
    private List<File> files;
    private List<Folder> folders;

    public Folder(String name) {
        this.name = name;
        this.parentFolder = null;
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }
    public Folder(String name, Folder parent) {
        this.name = name;
        this.parentFolder = parent;
        this.parentFolder.getFolders().add(this);
        this.files = new ArrayList<>();
        this.folders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void addFile(String fileName) {
        File file = new File(fileName);
        this.files.add(file);
    }

    public void print(int indentationLevel) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < indentationLevel; i++) {
            indentation.append("\t");
        }
        System.out.println(indentation + name);
        for (Folder folder : folders) {
            folder.print(indentationLevel + 1); // Increase indentation level for subfolders
        }
        for (File file : files) {
            System.out.println(indentation + "\t" + file.getFileName());
        }
    }

    public void delete() {
        files.clear();
        folders.clear();
        // removing this folder from the parent folder folders list
        this.parentFolder.getFolders().remove(this);
    }

    private class File {
        private String fileName;

        private File (String fileName) {
            this.fileName = fileName;

        }

        private String getFileName() {
            return fileName;
        }

        private void setFileName(String fileName) {
            this.fileName = fileName;
        }

        private void print() {
            System.out.println("\t" + fileName);
        }
    }
}
