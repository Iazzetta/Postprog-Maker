package pp.models;

public class Format {

    private Format(){}

    public static Format instance() {
        return FormatHolder.INSTANCE;
    }

    public String format(String... args){
        return new StringBuilder()
            .append("[CENTER][FONT=Impact][SIZE=6][COLOR=\"#808080\"]")
                .append(args[0]) // título
            .append("[/COLOR][/SIZE][/FONT]\n")
            .append("[QUOTE]")
                .append(args[1]) // descrição
            .append("[/QUOTE]\n")
            .append("[SIZE=5][FONT=Impact][COLOR=\"#808080\"]Source[/COLOR][/FONT][/SIZE][/CENTER]\n[PHP]")
                .append(args[2]) // source
            .append("[/PHP]\n")
            .append("[QUOTE]\n[B]Download:[/B] [url]")
                .append(args[3]) // download
            .append("[/url]\n[B]Scan:[/B] [url]")
                .append(args[4]) // scan
            .append("[/url]\n[/QUOTE]\n")
            .append("[RIGHT][B]Créditos[/B] - ")
                .append(args[5]) // créditos
            .append("[/RIGHT]").toString();
    }

    private static class FormatHolder {
        private static final Format INSTANCE = new Format();
    }
 }