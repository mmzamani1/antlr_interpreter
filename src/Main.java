import com.compiler.project.MyVisitor;
import com.compiler.project.NotSimpleCalcLexer;
import com.compiler.project.NotSimpleCalcParser;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import javax.swing.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {public static void main(String[] args) {
    String inputFile = "src/input.txt";
    if (args.length > 0) inputFile = args[0];

    try {
        CharStream input = CharStreams.fromPath(Paths.get(inputFile));
        NotSimpleCalcLexer lexer = new NotSimpleCalcLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NotSimpleCalcParser parser = new NotSimpleCalcParser(tokens);

        NotSimpleCalcParser.ProgramContext tree = parser.program();

        System.out.println(tree.toStringTree(parser));

        MyVisitor visitor = new MyVisitor();
        visitor.visit(tree);

        JFrame frame = new JFrame("Parse Tree");
        frame.setSize(800, 600);

        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.5);
        JScrollPane scrollPane = new JScrollPane(viewer);
        panel.add(scrollPane);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}