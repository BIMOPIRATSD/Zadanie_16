package n5;

public class Practicum {

    public String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public String fixText(String text) {
        if (text == null) {
            return null;
        }
        return capitalize(
                text.trim()
                        .replace("„", "«")
                        .replace("“", "»")
                        .replace("цевилизаций", "цивилизаций")
        );
    }

    public static void main(String[] args) {
        String text = "    история каждой из крупных галактических цевилизаций может быть разделена на три различные, " +
                "ярко выраженные фазы: Борьба за выживание, Любопытство и Утонченность, также именуемые фазами " +
                "„Как?“, „Зачем?“ и „Где?“. Пример: если для первой фазы характерен вопрос: „Как бы нам поесть?“," +
                " а для второй „Зачем мы едим?“, то третья отличается вопросом: „Где бы нам лучше поужинать?“.   ";

        var textFixer = new Practicum();
        var fixedText = textFixer.fixText(text);
        System.out.println(fixedText);
    }
}
