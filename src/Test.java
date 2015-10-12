
public class Test
{
    public static void main(String[] args)
    {

    }

    //    public static void main(String[] args) throws IOException
    //    {
    //        FileInputStream fstream = new FileInputStream("textfile.txt");
    //        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
    //
    //        String strLine;
    //
    //        //Read File Line By Line
    //        while ((strLine = br.readLine()) != null)
    //        {
    //            // Print the content on the console
    //            System.out.println(strLine);
    //        }
    //
    //        //Close the input stream
    //        br.close();
    //    }

    //    Show cool system information
    //    public static void main(String[] args)
    //    {
    //        int mb = 1024 * 1024;
    //
    //        long freeMemory = Runtime.getRuntime().freeMemory() / mb;
    //        long maxMemory = Runtime.getRuntime().maxMemory() / mb;
    //        long totalMemory = Runtime.getRuntime().totalMemory() / mb;
    //        int numberOfProcessors = Runtime.getRuntime().availableProcessors();
    //
    //        System.out.println("Free memory: " + freeMemory);
    //        System.out.println("Max memory: " + maxMemory);
    //        System.out.println("Total memory: " + totalMemory);
    //        System.out.println("Processors available: " + numberOfProcessors);
    //    }

    //    Ease of use for adding fitnesse tests to the junit tests
    //    public static void main(String[] args)
    //    {
    //        List<String> list = new ArrayList<String>();
    //
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.AdvancedAccountingCell.AdvancedAccountingCellSimple");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.AdvancedAccountingCell.FilterCheck");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.BalanceTests.TrialBalance");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.BeginningBalances.BeginningBalances");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.BudgetTests.BudgetReportStep1");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.CalculationTypes.CalculationsTypes");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.CalculationTypes.EndingAdjustment");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.CalculationTypes.ReverseSign");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.CalculationTypes.SourceOfCalculation");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.ConditionCell.ConditionCells");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.CurrencyTests.ConversionTypes");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.DateRelated.FormatTests");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.DynamicColumn.DynamicColumn");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FilterAllTypes.AreaFilters");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FilterAllTypes.BoundedRange");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FilterAllTypes.RangesNormal");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FilterAllTypes.SubstractAccounts");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FilterAllTypes.WildCards");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.AccountCodeDecription");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.AccountingCell");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.AdvancedCell");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.AreaFilters");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.FinancialArea");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.RangesBoundedRanges");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.RangesFinancialArea");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.SearchingOptions");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.SegmentRollups");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.VariableCompanyWithAccountingCell");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FinancialArea.WildCards");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FormulasButton.CalculationsTests");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.FormulasButton.LookupTests");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.ReferenceCell.ReferenceCell");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.RollUps.RollupTest");
    //        list.add("AllTests.NewSynoptixTesting.ColleagueReports.SortingTypeTests.StandardDescendingSortFinancialArea");
    //        list.add("AllTests.NewSynoptixTesting.VisualConnections.BudzarBiLookup");
    //        list.add("AllTests.NewSynoptixTesting.VisualConnections.BudzarTextLookup");
    //        list.add("AllTests.OperationalTutorial01InventoryListing");
    //        list.add("AllTests.ReplacementAccounts");
    //        list.add("AllTests.RossYear");
    //        list.add("AllTests.SalesByPartBudzar");
    //        list.add("AllTests.VisualAccountantsTrialBalance71");
    //
    //        StringBuilder sb = new StringBuilder();
    //
    //        for (String string : list)
    //        {
    //            sb.append("@Test");
    //            sb.append("\n");
    //            sb.append("public void test");
    //            if (string.toLowerCase().contains("colleague"))
    //            {
    //                sb.append("Colleague");
    //            }
    //            sb.append(string.substring(string.lastIndexOf('.') + 1, string.length()));
    //            sb.append("()");
    //            sb.append("\n");
    //            sb.append("{");
    //            sb.append("\n");
    //            sb.append("try");
    //            sb.append("\n");
    //            sb.append("{");
    //            sb.append("\n");
    //            sb.append("helper.assertTestPasses(\"");
    //            sb.append(string);
    //            sb.append("\");");
    //            sb.append("\n");
    //            sb.append("}");
    //            sb.append("\n");
    //            sb.append("catch (Exception e)");
    //            sb.append("\n");
    //            sb.append("{");
    //            sb.append("\n");
    //            sb.append("e.printStackTrace();");
    //            sb.append("\n");
    //            sb.append("}");
    //            sb.append("\n");
    //            sb.append("}");
    //            sb.append("\n");
    //            sb.append("\n");
    //        }
    //
    //        System.out.println(sb.toString());
    //    }

    // Test for dan's world peace button for fitnesse
    //static JButton button;
    //    public static void main(String[] args)
    //    {
    //        JFrame frame = new JFrame();
    //        JPanel panel = new JPanel();
    //        button = new JButton();
    //
    //        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //        frame.setLocation(300, 200);
    //        frame.setSize(100, 127);
    //        panel.setLayout(new BorderLayout());
    //        panel.add(button, BorderLayout.CENTER);
    //        frame.add(panel);
    //        frame.setVisible(true);
    //
    //        panel.revalidate();
    //
    //        button.addActionListener(new ActionListener()
    //        {
    //            @Override
    //            public void actionPerformed(ActionEvent e)
    //            {
    //                try
    //                {
    //                    Runtime.getRuntime().exec("wscript c:\\Users\\qa\\Desktop\\gitPullOrigin.vbs");
    //                }
    //                catch (IOException e1)
    //                {
    //                    e1.printStackTrace();
    //                }
    //            }
    //        });
    //    }
    //
    //    public Test()
    //    {
    //        button.setIcon(new ImageIcon(getClass().getResource("./peace.jpg")));
    //    }

    // Using derby files for writing to db :D
    /**
    private static String url = "jdbc:derby:./TestDerby";
    private static Connection connection = null;
    private static PreparedStatement statement = null;

    //    private static ResultSet resultSet = null;

    public static void main(String[] args)
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            System.out.println("Successful derby instance");

            connection = DriverManager.getConnection(url);
            System.out.println("Successful connection from url");

            if (createTable())
            {
                System.out.println("Table created");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception for connection");
            e.printStackTrace();
        }
    }

    private static boolean createTable()
    {
        String sql = "create table test (path varchar(1000), segment varchar(100), mask integer)";

        try
        {
            statement = connection.prepareStatement(sql);
            statement.executeUpdate();
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Exception creating table");
            e.printStackTrace();
        }
        return false;
    }
     */

    // Trying to read and write an image over and over to see any changes
    /**
    try
    {
        for (int i = 0; i < 30; i++)
        {
            BufferedImage image = ImageIO.read(new File("./src/screen.png"));
            ImageIO.write(image, "png", new File("./src/screen.png"));
        }
        return;
    }
    catch (IOException e)
    {
        e.printStackTrace();
    }
     */

    // Trying out a Robot keypress
    /**
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("F4");

        frame.setSize(200, 200);
        frame.setLocation(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.add(button);
        frame.add(panel);

        panel.setVisible(true);
        button.setVisible(true);
        frame.setVisible(true);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    Robot bot = new Robot();
                    bot.keyPress(KeyEvent.VK_F4);
                    bot.keyRelease(KeyEvent.VK_F4);
                }
                catch (AWTException e1)
                {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });
     */

    // Used to print out code for the loot generator
    /**
        int sectionsInt = 66;
        int amountRest = 100 / sectionsInt;
        int subtractThisFromTotal = sectionsInt * amountRest;
        int numberOfSectionsWithAmountPlusOne = 100 - subtractThisFromTotal - 1;
        int startingValue = 1;
        int endingValue = (numberOfSectionsWithAmountPlusOne > 0) ? startingValue + amountRest : startingValue + amountRest - 1;
        int numberOfTimesInFirstSet = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberOfSectionsWithAmountPlusOne; i++)
        {
            sb.append("if (secondRollAmount >= ");
            sb.append(startingValue);
            sb.append(" && secondRollAmount <= ");
            sb.append(endingValue);
            sb.append(")\n{\n\treturnString = \"\";\n}\n");

            startingValue = endingValue + 1;
            endingValue += amountRest + 1;
            numberOfTimesInFirstSet = i + 1;
        }

        int numberOfTimesInRest = sectionsInt - numberOfTimesInFirstSet;

        for (int i = 0; i < numberOfTimesInRest; i++)
        {
            sb.append("if (secondRollAmount >= ");
            sb.append(startingValue);
            sb.append(" && secondRollAmount <= ");
            sb.append(endingValue);
            sb.append(")\n{\n\treturnString = \"\";\n}\n");

            startingValue = endingValue + 1;
            endingValue += amountRest;
        }

        System.out.println(sb.toString());
     */

    // TIA stuff to generate project bulk import
    /**
            int num = 1;

            for (int i = 0; i < 1001; i++)
            {
                System.out.println(num + ", " + "project " + num + ", " + "desc " + num + ", " + "5");
                num++;
            }
     */

    // used to remove repeated characters in a string
    /**
    public static String removeRepeatedCharacters(String str)
    {
        String ourString = "";
        for (int i = 0; i < str.length() - 1; i++)
        {
            if (i == 0)
            {
                ourString = "" + str.charAt(i);
            }
            else
            {
                if (str.charAt(i - 1) != str.charAt(i))
                {
                    ourString = ourString + str.charAt(i);
                }
            }
        }
        return ourString;
    }
     */

    // Based on professor saying that adding to a list puts it as element 0 but still at the end of the list.
    /**
        List<String> list = new ArrayList<String>();

        list.add("First");
        System.out.println("Entire list: " + list.toString());
        System.out.println("list.get(0): " + list.get(0));
        System.out.println("\n\n");

        list.add("Second");
        System.out.println("Entire list: " + list.toString());
        System.out.println("list.get(0): " + list.get(0));
        System.out.println("\n\n");

        list.add("Third");
        System.out.println("Entire list: " + list.toString());
        System.out.println("list.get(0): " + list.get(0));
        System.out.println("\n\n");

        list.add("Fourth");
        System.out.println("Entire list: " + list.toString());
        System.out.println("list.get(0): " + list.get(0));
        System.out.println("\n\n");

        list.add("Fifth");
        System.out.println("Entire list: " + list.toString());
        System.out.println("list.get(0): " + list.get(0));
        System.out.println("\n\n");

        list.add("Sixth");
        System.out.println("Entire list: " + list.toString());
        System.out.println("list.get(0): " + list.get(0));
        System.out.println("\n\n");
     */

    // This was to test what would happen if you concatenated ints in a sysout, if it would add them or just concatenate them as is.
    /**
            int a = 1;
            int b = 5;

            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("a + b: " + (a + b));
            System.out.println("a + \"\" + b: " + (a + "" + b));
     */

    // Testing a code review thing where it wouldn't get into the else if it got into the if.
    /**
    //        boolean test = true;
    //
    //        if (test)
    //        {
    //            System.out.println("in if");
    //        }
    //        else if (test)
    //        {
    //            System.out.println("in else");
    //        }
     */

    // Trying to format a date in a specific format
    /**
    //        Calendar today = Calendar.getInstance();
    //        //        String notToday = "05/06/2013";
    //
    //        Date todayTime = today.getTime();
    //        System.out.println(new SimpleDateFormat("MM-dd-yyyy").format(todayTime));
    //
    //        String blah = new SimpleDateFormat("MM-dd-yyyy").format(todayTime);
    //        System.out.println(blah);
     */

    // Professor saying something stupid and incorrect about arrays.
    /**
            String[] testStrings = new String[5];

            for (int i = 0; i < 10; i++)
            {
                testStrings[i] = "4";
            }

            System.out.println(testStrings);
     */

    // Testing for randomness
    /**
            int mapSelection = 0;

            for (int i = 0; i < 300; i++)
            {
                mapSelection = (int)(Math.random() * 5);
                System.out.println(mapSelection);
            }
     */

    // TIA stuff to generate email addresses
    /**
            int num = 1001;

            for (int i = 0; i < 500; i++)
            {
                System.out.println(num + "@blah.com");
                num++;
            }
     */

    // TIA stuff to generate usernames
    /**
            int num = 1001;

            for (int i = 0; i < 500; i++)
            {
                System.out.println("t" + num);
                num++;
            }
     */

    // TIA stuff to generate employee ids
    /**
            int num = 1001;
            for (int i = 0; i < 500; i++)
            {
                System.out.println(num);
                num++;
            }
     */

    // self-explanatory
    //    public static void testRandomGenerator()
    //    {
    //        Random rand = new Random();
    //        List<Integer> list = new ArrayList<Integer>();
    //
    //        for (int i = 0; i < 10000000; i++)
    //        {
    //            list.add(rand.nextInt(1000) + 1);
    //        }
    //        if (list.contains(0) || list.contains(1001))
    //        {
    //            System.out.println("bad");
    //        }
    //        else
    //        {
    //            System.out.println("good");
    //        }
    //    }
}