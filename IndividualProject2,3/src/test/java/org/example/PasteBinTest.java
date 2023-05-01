package org.example;

import org.testng.annotations.Test;

public class PasteBinTest extends BaseTest {

    @Test
    public void paste() throws InterruptedException {
        PasteBinPage1.openBinPage();
        PasteBinPage1.createBin();
        PasteBinPage1.code();
        PasteBinPage1.setCreateNewPaste();
    }

}
