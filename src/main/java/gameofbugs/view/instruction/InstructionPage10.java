package gameofbugs.view.instruction;

import gameofbugs.model.Position;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class InstructionPage10 extends InstructionView {
    public InstructionPage10(HBox root) {
        super(root);
    }

    @Override
    protected void drawText() {
        Text text = new Text();
        text.setText("CME Status \n" +
                "\n" +
                "CME moves exactly three spaces like TLE but it can also move over Hive. Unlike MEM it`s not possible to end movement on top. CME has to move exactly two spaces on top and then one move down.\n" +
                "\n" +
                "Check how it works!\n");
        text.setFont(new Font(24));
        text.setWrappingWidth(400);
        textPane.setContent(text);
    }

    @Override
    protected VBox setRightBox() {
        VBox controlArea = new VBox();

        Button prevPageButton = new Button("Previous page");
        prevPageButton.setOnMouseClicked(event -> instructionSceneController.triggerPage(9));

        Button backToMenuButton = new Button("Back to menu");
        backToMenuButton.setOnMouseClicked(event -> instructionSceneController.triggerMenu());

        controlArea.getChildren().addAll(textPane, prevPageButton, backToMenuButton);

        return controlArea;
    }

    @Override
    protected void setBoard() {
        instructionController.triggerAction(new Position(-1, 2));
        instructionController.triggerAction(new Position(16, 16));
        instructionController.triggerAction(new Position(-2, 2));
        instructionController.triggerAction(new Position(15, 17));
        instructionController.triggerAction(new Position(-1, 1));
        instructionController.triggerAction(new Position(16, 15));
        instructionController.triggerAction(new Position(-2, 3));
        instructionController.triggerAction(new Position(15, 18));
        instructionController.triggerAction(new Position(-1, 0));
        instructionController.triggerAction(new Position(17, 16));
        instructionController.triggerAction(new Position(-2, 2));
        instructionController.triggerAction(new Position(14, 17));
        instructionController.triggerAction(new Position(-1, 5));
        instructionController.triggerAction(new Position(15, 15));
        instructionController.triggerAction(new Position(-2, 1));
        instructionController.triggerAction(new Position(-2, 0));
        instructionController.triggerAction(new Position(13, 17));
        instructionController.triggerAction(new Position(-2, 5));
        instructionController.triggerAction(new Position(-2, 4));
        instructionController.triggerAction(new Position(-1, 4));
        instructionController.triggerAction(new Position(17, 17));
        instructionController.triggerAction(new Position(-2, 5));
        instructionController.triggerAction(new Position(14, 18));
        instructionController.triggerAction(new Position(15, 15));
        instructionController.triggerAction(new Position(16, 17));
        instructionController.triggerAction(new Position(-2, 3));
        instructionController.triggerAction(new Position(13, 19));
        instructionController.triggerAction(new Position(16, 17));
        instructionController.triggerAction(new Position(16, 17));

    }
}