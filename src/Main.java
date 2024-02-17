public class Main {
    public static void main(String[] args) {
        Folder php_demo1 = new Folder("php_demo1");

        Folder sourceFiles = new Folder("Source Files", php_demo1);


        Folder phalcon = new Folder((".phalcon"), sourceFiles);
        Folder app = new Folder("app" , sourceFiles);


        Folder config = new Folder("config", app);

        Folder controllers = new Folder("controllers", app);

        Folder library = new Folder("Library", app);

        Folder migrations = new Folder("migrations", app);

        Folder models = new Folder("models", app);

        Folder views = new Folder("views", app);


        Folder cache = new Folder("cache", sourceFiles);

        Folder publicFolder = new Folder("public", sourceFiles);


        publicFolder.addFile(".htaccess");

        publicFolder.addFile(".router pro");

        publicFolder.addFile(".index hom");

        Folder includePath = new Folder("Include Path", php_demo1);

        Folder remoteFiles = new Folder("Remote Files", php_demo1);

        php_demo1.print(0);

        System.out.println("---------------");
        app.delete();

        php_demo1.print(0);


        System.out.println("---------------");

        publicFolder.delete();

        php_demo1.print(0);
    }
}