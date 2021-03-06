package com.apon.day7;

public class Day7Input {
    public final static String EXAMPLE_INPUT = "light red bags contain 1 bright white bag, 2 muted yellow bags.\n" +
            "dark orange bags contain 3 bright white bags, 4 muted yellow bags.\n" +
            "bright white bags contain 1 shiny gold bag.\n" +
            "muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.\n" +
            "shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.\n" +
            "dark olive bags contain 3 faded blue bags, 4 dotted black bags.\n" +
            "vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.\n" +
            "faded blue bags contain no other bags.\n" +
            "dotted black bags contain no other bags.";

    public final static String PART2_EXAMPLE_INPUT = "shiny gold bags contain 2 dark red bags.\n" +
            "dark red bags contain 2 dark orange bags.\n" +
            "dark orange bags contain 2 dark yellow bags.\n" +
            "dark yellow bags contain 2 dark green bags.\n" +
            "dark green bags contain 2 dark blue bags.\n" +
            "dark blue bags contain 2 dark violet bags.\n" +
            "dark violet bags contain no other bags.";

    public final static String INPUT = "vibrant bronze bags contain 3 dim olive bags.\n" +
            "shiny teal bags contain 1 posh green bag, 5 pale indigo bags, 1 mirrored purple bag.\n" +
            "striped aqua bags contain 5 bright orange bags.\n" +
            "clear chartreuse bags contain 3 dotted black bags, 2 wavy olive bags.\n" +
            "light lime bags contain 1 posh silver bag, 5 clear orange bags, 2 light olive bags, 3 dull maroon bags.\n" +
            "light olive bags contain 4 striped turquoise bags.\n" +
            "shiny purple bags contain 2 posh silver bags, 3 striped silver bags, 5 shiny beige bags, 2 plaid chartreuse bags.\n" +
            "mirrored crimson bags contain 2 faded cyan bags.\n" +
            "shiny turquoise bags contain 5 dull purple bags.\n" +
            "dim red bags contain 2 dim salmon bags, 2 faded orange bags, 5 muted aqua bags.\n" +
            "vibrant yellow bags contain 5 mirrored white bags, 5 vibrant blue bags, 3 mirrored lavender bags, 1 wavy cyan bag.\n" +
            "posh salmon bags contain 1 dull black bag, 1 striped indigo bag, 1 muted silver bag, 2 vibrant crimson bags.\n" +
            "pale black bags contain 1 plaid cyan bag.\n" +
            "dotted salmon bags contain 3 wavy brown bags, 3 pale coral bags, 1 light maroon bag.\n" +
            "posh orange bags contain 5 muted green bags, 3 striped violet bags.\n" +
            "dull maroon bags contain 2 clear brown bags, 5 posh silver bags, 5 mirrored coral bags, 2 dim lavender bags.\n" +
            "bright lavender bags contain 3 dark chartreuse bags, 1 mirrored chartreuse bag, 2 striped orange bags, 4 striped bronze bags.\n" +
            "plaid white bags contain 2 pale aqua bags.\n" +
            "posh teal bags contain 1 muted crimson bag, 2 dark fuchsia bags, 2 dim black bags, 4 plaid cyan bags.\n" +
            "wavy maroon bags contain 2 dull magenta bags, 3 dark red bags, 5 dull green bags, 4 bright turquoise bags.\n" +
            "plaid teal bags contain 5 plaid plum bags, 3 light magenta bags.\n" +
            "plaid plum bags contain 3 striped lime bags, 5 clear maroon bags, 3 muted plum bags.\n" +
            "muted purple bags contain 5 muted fuchsia bags, 4 pale tomato bags.\n" +
            "dark gold bags contain 5 dim lime bags, 3 clear orange bags, 4 drab crimson bags, 1 faded cyan bag.\n" +
            "striped coral bags contain 4 pale aqua bags, 5 clear silver bags.\n" +
            "shiny chartreuse bags contain 1 muted plum bag, 3 vibrant tomato bags.\n" +
            "bright salmon bags contain 5 pale gold bags, 1 muted gold bag, 5 dark gray bags, 4 dull cyan bags.\n" +
            "dark crimson bags contain 1 plaid turquoise bag.\n" +
            "light coral bags contain 1 muted brown bag, 2 striped black bags, 5 dark gray bags.\n" +
            "dotted lavender bags contain 1 bright turquoise bag.\n" +
            "posh red bags contain 2 muted green bags.\n" +
            "dim turquoise bags contain 4 dull chartreuse bags.\n" +
            "posh lime bags contain 5 mirrored yellow bags, 1 striped silver bag.\n" +
            "wavy black bags contain 5 striped cyan bags, 4 wavy red bags, 2 dotted coral bags.\n" +
            "dotted brown bags contain 1 dim gray bag, 1 plaid tomato bag.\n" +
            "mirrored red bags contain 4 posh aqua bags, 4 dark gray bags, 5 dark turquoise bags.\n" +
            "plaid tan bags contain 4 plaid black bags, 4 dull fuchsia bags, 1 plaid plum bag, 3 dark chartreuse bags.\n" +
            "plaid bronze bags contain 2 muted lavender bags, 3 faded cyan bags, 3 mirrored chartreuse bags, 1 dull coral bag.\n" +
            "mirrored silver bags contain 3 dull bronze bags, 3 dim tomato bags.\n" +
            "shiny fuchsia bags contain 3 bright maroon bags, 1 vibrant tomato bag, 4 posh bronze bags, 1 striped bronze bag.\n" +
            "dotted plum bags contain 5 wavy fuchsia bags.\n" +
            "dim bronze bags contain 3 shiny red bags, 5 dotted chartreuse bags.\n" +
            "faded crimson bags contain 3 bright olive bags, 1 dark bronze bag, 5 drab crimson bags.\n" +
            "striped blue bags contain 4 drab blue bags.\n" +
            "posh purple bags contain 1 bright blue bag, 4 light black bags, 1 dotted violet bag.\n" +
            "shiny lavender bags contain 4 mirrored bronze bags.\n" +
            "dull beige bags contain 2 wavy chartreuse bags.\n" +
            "dim blue bags contain 1 bright magenta bag, 5 muted red bags.\n" +
            "pale yellow bags contain 1 dotted white bag.\n" +
            "mirrored blue bags contain 3 striped tan bags.\n" +
            "mirrored turquoise bags contain 2 plaid red bags, 5 muted red bags, 2 muted green bags.\n" +
            "faded fuchsia bags contain 3 wavy tomato bags, 1 vibrant red bag, 1 dotted green bag, 2 posh plum bags.\n" +
            "drab silver bags contain 2 muted fuchsia bags, 4 dotted gray bags, 4 dotted aqua bags.\n" +
            "clear teal bags contain 5 shiny maroon bags, 1 clear green bag.\n" +
            "dim brown bags contain 4 faded lavender bags, 5 striped lime bags, 1 dark aqua bag, 1 dark fuchsia bag.\n" +
            "muted beige bags contain 1 dim aqua bag, 4 plaid plum bags, 3 light white bags, 4 muted cyan bags.\n" +
            "muted blue bags contain 2 bright blue bags.\n" +
            "vibrant turquoise bags contain 3 muted crimson bags.\n" +
            "mirrored indigo bags contain 2 wavy lime bags, 5 bright olive bags, 5 bright black bags, 5 vibrant violet bags.\n" +
            "posh tomato bags contain 4 muted orange bags, 3 plaid white bags, 3 shiny tomato bags, 3 light beige bags.\n" +
            "bright gray bags contain 5 pale aqua bags, 3 shiny gold bags, 1 clear olive bag, 1 dull fuchsia bag.\n" +
            "pale green bags contain 4 light black bags, 3 posh purple bags, 2 clear chartreuse bags, 2 drab lime bags.\n" +
            "light orange bags contain 5 shiny chartreuse bags, 2 wavy blue bags, 2 wavy yellow bags.\n" +
            "light green bags contain 5 dark bronze bags, 4 light tan bags, 4 dim chartreuse bags.\n" +
            "shiny indigo bags contain 3 faded cyan bags.\n" +
            "dotted orange bags contain 2 wavy crimson bags, 3 dull green bags, 5 dark indigo bags.\n" +
            "dotted black bags contain 2 vibrant white bags.\n" +
            "plaid gold bags contain 3 mirrored bronze bags, 5 striped tan bags.\n" +
            "muted salmon bags contain 5 dull maroon bags, 1 vibrant tan bag, 1 dim purple bag, 4 dull chartreuse bags.\n" +
            "plaid salmon bags contain 5 dotted purple bags, 5 dim orange bags.\n" +
            "bright crimson bags contain 3 plaid maroon bags, 2 dim aqua bags, 5 dull magenta bags, 5 pale tomato bags.\n" +
            "dotted fuchsia bags contain 1 dark cyan bag, 1 striped magenta bag, 3 clear coral bags, 4 light purple bags.\n" +
            "dull blue bags contain 5 dim magenta bags, 1 mirrored maroon bag, 5 dark indigo bags.\n" +
            "dull orange bags contain 3 drab blue bags, 1 shiny beige bag.\n" +
            "muted red bags contain 5 clear brown bags, 5 striped turquoise bags, 3 dull fuchsia bags.\n" +
            "shiny coral bags contain 5 dark olive bags, 5 light blue bags.\n" +
            "drab violet bags contain 5 clear chartreuse bags, 2 posh orange bags, 3 pale purple bags.\n" +
            "clear blue bags contain 4 dull fuchsia bags, 4 faded purple bags, 3 mirrored plum bags.\n" +
            "vibrant beige bags contain 2 posh silver bags.\n" +
            "bright bronze bags contain 1 shiny yellow bag, 5 muted green bags, 3 dark gray bags.\n" +
            "bright orange bags contain no other bags.\n" +
            "light teal bags contain 3 mirrored magenta bags, 5 faded gray bags.\n" +
            "dark green bags contain 4 drab white bags, 2 drab green bags, 5 dotted coral bags, 1 mirrored black bag.\n" +
            "plaid silver bags contain 2 dotted bronze bags.\n" +
            "drab turquoise bags contain 3 bright white bags, 3 drab maroon bags.\n" +
            "dim magenta bags contain 5 dark fuchsia bags, 2 drab teal bags, 2 drab crimson bags, 2 dull fuchsia bags.\n" +
            "pale coral bags contain no other bags.\n" +
            "dull indigo bags contain 2 bright black bags, 1 drab lime bag, 5 light magenta bags, 1 faded orange bag.\n" +
            "dim indigo bags contain 5 dark maroon bags.\n" +
            "shiny gold bags contain 5 light black bags, 3 mirrored yellow bags, 5 muted plum bags.\n" +
            "faded lime bags contain 5 dark crimson bags, 3 shiny orange bags, 5 plaid tomato bags, 4 mirrored cyan bags.\n" +
            "faded cyan bags contain 3 shiny gold bags.\n" +
            "striped olive bags contain 4 vibrant red bags.\n" +
            "wavy white bags contain 5 posh silver bags, 5 mirrored gold bags, 5 pale black bags.\n" +
            "dim plum bags contain 5 dotted plum bags, 2 clear silver bags, 2 wavy bronze bags.\n" +
            "drab cyan bags contain 2 muted plum bags, 2 dotted bronze bags, 3 posh violet bags.\n" +
            "clear bronze bags contain 1 clear plum bag, 5 striped plum bags.\n" +
            "posh gray bags contain 5 clear chartreuse bags.\n" +
            "striped brown bags contain 3 dim olive bags, 1 light black bag, 4 vibrant crimson bags, 2 striped fuchsia bags.\n" +
            "wavy tomato bags contain 2 mirrored chartreuse bags.\n" +
            "dull white bags contain 1 mirrored brown bag, 2 dull green bags.\n" +
            "vibrant green bags contain 4 drab fuchsia bags.\n" +
            "dark tomato bags contain 3 light gray bags, 2 dull cyan bags, 4 striped silver bags, 5 dark fuchsia bags.\n" +
            "dim tomato bags contain 2 dark turquoise bags, 1 mirrored black bag, 3 posh maroon bags.\n" +
            "bright gold bags contain 5 pale aqua bags, 3 clear tomato bags, 1 dark yellow bag, 1 drab green bag.\n" +
            "dotted indigo bags contain 5 light purple bags, 2 plaid coral bags, 5 pale green bags.\n" +
            "plaid magenta bags contain 1 dotted bronze bag, 3 drab turquoise bags, 1 dark lime bag.\n" +
            "drab gray bags contain 3 dark gray bags, 5 clear turquoise bags.\n" +
            "dim gold bags contain 5 dark maroon bags.\n" +
            "dark black bags contain 5 dark violet bags, 2 dotted cyan bags.\n" +
            "posh chartreuse bags contain 2 posh magenta bags, 2 striped lime bags.\n" +
            "wavy beige bags contain 3 drab olive bags, 2 shiny beige bags, 1 faded purple bag.\n" +
            "plaid green bags contain 5 pale olive bags, 5 posh bronze bags, 4 bright tomato bags.\n" +
            "dotted blue bags contain 3 posh silver bags.\n" +
            "shiny cyan bags contain 1 mirrored turquoise bag, 1 striped beige bag, 5 bright silver bags, 3 light olive bags.\n" +
            "dark aqua bags contain 1 plaid black bag, 3 posh coral bags, 4 striped magenta bags, 2 mirrored turquoise bags.\n" +
            "drab salmon bags contain 2 striped bronze bags.\n" +
            "posh brown bags contain 3 bright white bags.\n" +
            "mirrored chartreuse bags contain 5 posh lime bags, 4 bright blue bags, 4 clear brown bags, 3 bright orange bags.\n" +
            "clear red bags contain 1 plaid beige bag, 2 posh brown bags, 2 shiny aqua bags.\n" +
            "wavy olive bags contain 4 clear maroon bags, 1 striped silver bag.\n" +
            "faded green bags contain 4 plaid red bags, 3 dim olive bags.\n" +
            "clear purple bags contain 1 plaid olive bag, 3 light chartreuse bags.\n" +
            "dull lime bags contain 4 dark tan bags, 1 light chartreuse bag, 5 vibrant silver bags.\n" +
            "dark red bags contain 5 faded orange bags.\n" +
            "wavy plum bags contain 5 dull teal bags, 3 clear maroon bags, 3 shiny tan bags.\n" +
            "dark white bags contain 3 muted red bags.\n" +
            "light turquoise bags contain 3 light black bags.\n" +
            "pale fuchsia bags contain 3 dim brown bags, 5 clear purple bags.\n" +
            "light maroon bags contain 3 mirrored turquoise bags.\n" +
            "striped fuchsia bags contain 1 dotted aqua bag.\n" +
            "mirrored magenta bags contain 5 striped white bags, 4 striped violet bags, 4 dull maroon bags, 5 striped indigo bags.\n" +
            "dark violet bags contain 2 mirrored black bags, 5 dotted fuchsia bags, 3 muted fuchsia bags.\n" +
            "muted cyan bags contain 3 muted salmon bags, 4 drab black bags, 2 posh green bags.\n" +
            "muted tan bags contain 4 posh coral bags, 2 bright fuchsia bags.\n" +
            "faded aqua bags contain 5 striped magenta bags, 1 dim aqua bag.\n" +
            "bright tomato bags contain 2 muted green bags, 1 light olive bag.\n" +
            "clear silver bags contain 4 wavy cyan bags, 3 bright orange bags, 5 mirrored coral bags, 3 light olive bags.\n" +
            "vibrant chartreuse bags contain 4 light gray bags.\n" +
            "dull olive bags contain 1 mirrored lavender bag, 4 dotted coral bags, 4 pale chartreuse bags, 1 dull coral bag.\n" +
            "pale gray bags contain 3 plaid orange bags.\n" +
            "wavy lime bags contain 1 bright orange bag, 2 wavy yellow bags, 2 light purple bags, 4 wavy indigo bags.\n" +
            "faded white bags contain 1 dotted violet bag, 1 dark maroon bag, 3 posh coral bags.\n" +
            "muted white bags contain 3 faded magenta bags.\n" +
            "wavy brown bags contain 4 vibrant yellow bags, 4 dull lavender bags.\n" +
            "clear violet bags contain 5 shiny tan bags.\n" +
            "clear olive bags contain 3 bright fuchsia bags, 5 dark maroon bags, 4 mirrored white bags, 5 shiny beige bags.\n" +
            "light beige bags contain 4 mirrored gray bags, 2 wavy brown bags, 3 pale blue bags, 4 striped silver bags.\n" +
            "plaid turquoise bags contain 1 vibrant aqua bag, 4 bright fuchsia bags.\n" +
            "posh coral bags contain 3 dark tomato bags.\n" +
            "wavy red bags contain 5 posh gray bags, 3 dim lime bags, 2 light tan bags, 3 bright blue bags.\n" +
            "wavy fuchsia bags contain 5 vibrant aqua bags.\n" +
            "faded turquoise bags contain 2 dark maroon bags, 1 pale indigo bag, 4 faded white bags.\n" +
            "clear indigo bags contain 4 pale purple bags, 5 dull green bags, 1 bright olive bag.\n" +
            "vibrant lime bags contain 1 light purple bag, 5 posh bronze bags, 5 drab blue bags, 1 bright black bag.\n" +
            "shiny bronze bags contain 1 plaid red bag.\n" +
            "vibrant plum bags contain 1 wavy black bag, 4 drab aqua bags, 5 dark cyan bags.\n" +
            "mirrored fuchsia bags contain 5 bright olive bags, 4 mirrored crimson bags, 1 dim salmon bag.\n" +
            "bright fuchsia bags contain 4 light gray bags.\n" +
            "bright silver bags contain 5 striped tan bags.\n" +
            "dotted gray bags contain 1 striped silver bag, 5 bright black bags, 2 mirrored yellow bags.\n" +
            "dark olive bags contain 5 striped lime bags, 1 bright black bag.\n" +
            "light lavender bags contain 1 dark bronze bag, 2 faded gold bags, 3 light orange bags.\n" +
            "mirrored green bags contain 2 faded orange bags.\n" +
            "faded blue bags contain 2 drab coral bags, 3 posh salmon bags.\n" +
            "vibrant red bags contain 3 bright cyan bags, 4 light aqua bags, 4 posh gray bags, 5 wavy purple bags.\n" +
            "dotted yellow bags contain 3 mirrored tan bags, 1 clear crimson bag, 3 light turquoise bags.\n" +
            "clear orange bags contain 4 pale coral bags, 3 posh silver bags, 2 dull fuchsia bags.\n" +
            "pale violet bags contain 5 light crimson bags.\n" +
            "mirrored beige bags contain 5 bright coral bags.\n" +
            "shiny tomato bags contain 4 dotted red bags, 2 plaid lavender bags, 5 dim orange bags.\n" +
            "muted bronze bags contain 3 striped tan bags, 3 faded orange bags, 2 faded maroon bags, 3 clear tomato bags.\n" +
            "muted fuchsia bags contain 1 dark maroon bag, 2 dotted bronze bags, 4 mirrored bronze bags, 1 faded cyan bag.\n" +
            "mirrored orange bags contain 2 plaid cyan bags, 5 wavy orange bags, 5 shiny aqua bags, 5 wavy tan bags.\n" +
            "light blue bags contain 1 mirrored chartreuse bag, 3 dim crimson bags.\n" +
            "bright turquoise bags contain 2 clear orange bags.\n" +
            "dark plum bags contain 3 wavy lime bags, 1 light tan bag, 3 light silver bags, 1 light lime bag.\n" +
            "wavy cyan bags contain 4 dull coral bags, 4 light olive bags.\n" +
            "striped cyan bags contain 4 dull lavender bags.\n" +
            "drab purple bags contain 4 shiny tomato bags, 4 bright orange bags, 4 mirrored gold bags.\n" +
            "faded indigo bags contain 5 mirrored indigo bags, 2 muted silver bags, 5 faded lime bags, 4 dim salmon bags.\n" +
            "faded orange bags contain 5 plaid chartreuse bags, 4 bright black bags, 5 light magenta bags, 4 wavy bronze bags.\n" +
            "wavy gold bags contain 1 shiny orange bag, 3 clear salmon bags, 3 plaid orange bags, 4 vibrant tan bags.\n" +
            "wavy blue bags contain 3 clear brown bags, 1 faded tomato bag, 5 drab green bags.\n" +
            "plaid violet bags contain 1 light blue bag, 5 drab purple bags.\n" +
            "wavy tan bags contain 4 dotted blue bags.\n" +
            "drab plum bags contain 2 muted silver bags, 5 shiny maroon bags.\n" +
            "drab fuchsia bags contain 2 muted maroon bags, 2 mirrored turquoise bags, 5 clear green bags, 3 light olive bags.\n" +
            "light violet bags contain 4 clear turquoise bags, 4 mirrored gold bags, 2 wavy chartreuse bags, 2 mirrored tan bags.\n" +
            "shiny maroon bags contain 1 plaid salmon bag, 4 pale brown bags, 1 dim orange bag, 1 wavy tomato bag.\n" +
            "drab crimson bags contain 2 dim gray bags, 5 dull fuchsia bags.\n" +
            "faded plum bags contain 2 striped turquoise bags, 5 light gray bags.\n" +
            "clear beige bags contain 4 faded orange bags, 2 mirrored black bags, 1 shiny red bag, 1 dark teal bag.\n" +
            "faded black bags contain 5 mirrored plum bags, 5 muted plum bags.\n" +
            "pale olive bags contain 4 muted yellow bags, 5 mirrored maroon bags.\n" +
            "plaid black bags contain 3 dark gray bags.\n" +
            "plaid fuchsia bags contain 1 wavy beige bag.\n" +
            "shiny white bags contain 3 posh orange bags, 5 posh blue bags, 4 faded white bags, 1 wavy crimson bag.\n" +
            "shiny lime bags contain 5 posh black bags, 2 mirrored bronze bags, 5 muted bronze bags, 2 posh violet bags.\n" +
            "shiny magenta bags contain 5 dark lime bags.\n" +
            "plaid tomato bags contain 5 wavy cyan bags, 3 clear brown bags, 3 dark olive bags, 4 vibrant white bags.\n" +
            "dark blue bags contain 3 mirrored black bags, 3 pale indigo bags, 3 dim cyan bags, 3 light olive bags.\n" +
            "muted lavender bags contain 1 dotted purple bag, 1 drab blue bag, 5 mirrored bronze bags, 3 striped violet bags.\n" +
            "faded silver bags contain 2 dim orange bags, 4 shiny chartreuse bags, 2 drab blue bags, 1 wavy violet bag.\n" +
            "shiny beige bags contain 4 muted green bags, 5 striped aqua bags, 2 dim black bags, 3 dull fuchsia bags.\n" +
            "vibrant indigo bags contain 3 pale red bags, 3 clear lime bags, 4 vibrant cyan bags, 2 pale tomato bags.\n" +
            "bright red bags contain 2 mirrored lime bags, 1 dim indigo bag, 5 bright black bags, 2 drab crimson bags.\n" +
            "light gray bags contain no other bags.\n" +
            "dim orange bags contain 4 clear chartreuse bags, 4 striped tan bags.\n" +
            "dull plum bags contain 4 faded aqua bags, 3 pale salmon bags, 1 posh gray bag.\n" +
            "dull crimson bags contain 5 posh red bags, 4 mirrored plum bags, 1 dull fuchsia bag.\n" +
            "pale blue bags contain 1 dotted red bag, 5 muted chartreuse bags, 3 clear green bags, 1 wavy beige bag.\n" +
            "dotted cyan bags contain 4 faded red bags, 2 bright gold bags.\n" +
            "mirrored lavender bags contain 1 vibrant white bag, 1 mirrored plum bag, 5 dotted black bags, 5 bright orange bags.\n" +
            "mirrored tomato bags contain 2 shiny chartreuse bags, 2 shiny bronze bags, 4 bright turquoise bags.\n" +
            "bright indigo bags contain 3 striped orange bags, 1 dotted lime bag, 1 shiny magenta bag, 2 light fuchsia bags.\n" +
            "drab brown bags contain 5 plaid magenta bags, 5 dim aqua bags, 4 vibrant aqua bags.\n" +
            "posh turquoise bags contain 3 bright tomato bags, 4 striped tomato bags, 5 dim turquoise bags.\n" +
            "shiny violet bags contain 1 drab gold bag, 5 plaid silver bags, 3 vibrant magenta bags.\n" +
            "bright green bags contain 5 dull aqua bags, 2 pale tomato bags, 1 posh lavender bag, 1 dim tomato bag.\n" +
            "striped tomato bags contain 4 bright salmon bags.\n" +
            "shiny black bags contain 3 drab aqua bags, 4 drab salmon bags, 1 dim turquoise bag.\n" +
            "dotted silver bags contain 4 plaid orange bags, 3 mirrored tan bags.\n" +
            "shiny red bags contain 4 dim lime bags, 3 posh bronze bags, 3 striped tomato bags, 2 vibrant aqua bags.\n" +
            "dim green bags contain 3 dotted blue bags, 4 faded cyan bags, 4 drab silver bags, 5 clear blue bags.\n" +
            "dull teal bags contain 4 striped orange bags, 5 bright coral bags, 4 bright gold bags.\n" +
            "posh beige bags contain 4 dark indigo bags.\n" +
            "clear green bags contain 3 drab blue bags, 2 dark maroon bags.\n" +
            "faded teal bags contain 4 mirrored maroon bags, 3 clear cyan bags, 4 plaid silver bags.\n" +
            "plaid maroon bags contain 2 plaid brown bags.\n" +
            "light yellow bags contain 3 dotted chartreuse bags.\n" +
            "dotted green bags contain 1 clear olive bag, 2 bright blue bags, 3 striped indigo bags, 3 dull indigo bags.\n" +
            "vibrant lavender bags contain 4 clear tomato bags, 1 posh tomato bag, 4 drab bronze bags.\n" +
            "dull red bags contain 1 dark red bag, 4 bright black bags.\n" +
            "dark chartreuse bags contain 2 clear turquoise bags, 2 clear coral bags, 2 vibrant magenta bags.\n" +
            "clear aqua bags contain 3 mirrored lime bags.\n" +
            "posh white bags contain 4 mirrored chartreuse bags, 1 light purple bag, 3 muted maroon bags, 2 pale olive bags.\n" +
            "pale cyan bags contain 3 plaid lime bags, 1 drab salmon bag.\n" +
            "mirrored yellow bags contain 4 light olive bags.\n" +
            "faded violet bags contain 2 muted red bags, 1 striped coral bag, 1 dark chartreuse bag, 3 vibrant aqua bags.\n" +
            "bright lime bags contain 1 muted chartreuse bag.\n" +
            "dotted teal bags contain 3 dark orange bags.\n" +
            "plaid beige bags contain 4 drab chartreuse bags, 5 clear orange bags, 1 dim orange bag, 4 dotted bronze bags.\n" +
            "muted violet bags contain 5 striped crimson bags, 3 dark gold bags, 4 muted magenta bags, 5 vibrant olive bags.\n" +
            "dotted turquoise bags contain 1 drab olive bag, 1 plaid turquoise bag.\n" +
            "dim yellow bags contain 4 dotted blue bags, 4 wavy teal bags.\n" +
            "light purple bags contain 1 mirrored yellow bag.\n" +
            "wavy turquoise bags contain 4 muted gold bags, 3 wavy orange bags, 3 clear tomato bags, 1 light tan bag.\n" +
            "vibrant silver bags contain 1 plaid red bag, 2 clear turquoise bags.\n" +
            "faded brown bags contain 5 faded gray bags, 3 drab maroon bags, 5 striped aqua bags.\n" +
            "posh indigo bags contain 1 wavy green bag, 5 dotted blue bags.\n" +
            "drab lavender bags contain 3 vibrant indigo bags, 2 faded black bags, 4 dull coral bags, 2 wavy lime bags.\n" +
            "vibrant blue bags contain 5 posh purple bags, 4 dark gold bags, 2 mirrored lavender bags.\n" +
            "posh blue bags contain 4 wavy bronze bags, 5 dull chartreuse bags, 1 muted teal bag, 3 bright black bags.\n" +
            "posh aqua bags contain 4 pale gold bags, 2 faded white bags.\n" +
            "bright yellow bags contain 1 wavy coral bag, 2 drab turquoise bags.\n" +
            "wavy lavender bags contain 2 faded red bags, 4 faded cyan bags.\n" +
            "dotted aqua bags contain 1 muted cyan bag, 2 muted black bags, 3 wavy chartreuse bags, 1 shiny magenta bag.\n" +
            "vibrant white bags contain 3 muted green bags, 2 bright tomato bags.\n" +
            "posh yellow bags contain 3 mirrored lime bags, 5 dark fuchsia bags, 1 posh red bag, 5 plaid cyan bags.\n" +
            "clear gray bags contain 4 wavy magenta bags, 3 shiny orange bags.\n" +
            "clear fuchsia bags contain 2 dull beige bags, 5 striped turquoise bags, 2 posh silver bags.\n" +
            "shiny tan bags contain 1 drab orange bag, 4 faded cyan bags, 5 dark teal bags.\n" +
            "faded bronze bags contain 2 shiny aqua bags.\n" +
            "pale indigo bags contain 1 plaid turquoise bag.\n" +
            "faded tomato bags contain 3 pale brown bags.\n" +
            "plaid indigo bags contain 1 dull beige bag.\n" +
            "dark salmon bags contain 3 wavy purple bags, 3 dull indigo bags, 4 dim blue bags, 3 dull green bags.\n" +
            "bright tan bags contain 2 posh bronze bags.\n" +
            "vibrant fuchsia bags contain 4 striped olive bags, 5 clear yellow bags, 5 muted fuchsia bags, 3 shiny plum bags.\n" +
            "dark gray bags contain 3 light gray bags.\n" +
            "posh magenta bags contain 5 bright blue bags.\n" +
            "mirrored bronze bags contain 5 bright olive bags, 4 light magenta bags.\n" +
            "posh cyan bags contain 4 light indigo bags, 2 dark aqua bags, 5 mirrored lime bags, 2 faded magenta bags.\n" +
            "light chartreuse bags contain 4 dark indigo bags, 2 wavy magenta bags, 5 dim white bags, 1 plaid bronze bag.\n" +
            "bright plum bags contain 4 dotted lime bags, 2 mirrored red bags, 1 plaid plum bag, 1 mirrored gold bag.\n" +
            "dark beige bags contain 4 mirrored white bags, 2 muted plum bags, 5 mirrored lime bags, 2 plaid teal bags.\n" +
            "light bronze bags contain 1 muted black bag.\n" +
            "bright magenta bags contain 3 striped lime bags.\n" +
            "dull green bags contain 2 light purple bags, 1 dull maroon bag, 2 dotted violet bags, 4 clear blue bags.\n" +
            "drab maroon bags contain 3 bright tomato bags.\n" +
            "muted gray bags contain 1 shiny plum bag, 2 posh fuchsia bags, 1 plaid black bag, 2 dim black bags.\n" +
            "pale aqua bags contain 5 mirrored plum bags, 1 dark fuchsia bag, 3 faded tomato bags, 1 striped aqua bag.\n" +
            "plaid yellow bags contain 2 plaid plum bags.\n" +
            "vibrant tan bags contain 3 light gray bags, 5 bright salmon bags, 3 pale green bags, 5 posh gray bags.\n" +
            "faded lavender bags contain 2 shiny yellow bags, 3 dotted black bags, 4 dotted purple bags.\n" +
            "muted aqua bags contain 3 mirrored blue bags, 2 plaid salmon bags.\n" +
            "wavy silver bags contain 3 posh lime bags, 2 striped tan bags.\n" +
            "pale lime bags contain 5 striped orange bags, 4 plaid turquoise bags, 1 dark lime bag, 5 muted cyan bags.\n" +
            "dark bronze bags contain 3 clear silver bags, 5 faded tomato bags, 5 light olive bags, 4 bright fuchsia bags.\n" +
            "dull gray bags contain 1 clear silver bag, 1 light purple bag.\n" +
            "clear tomato bags contain 3 wavy coral bags, 2 dim orange bags, 2 dim magenta bags.\n" +
            "dull chartreuse bags contain 2 plaid teal bags, 4 dotted purple bags, 1 faded tomato bag.\n" +
            "vibrant gold bags contain 2 striped aqua bags, 5 vibrant cyan bags, 2 dotted olive bags, 2 clear olive bags.\n" +
            "wavy green bags contain 5 dim lavender bags.\n" +
            "posh olive bags contain 3 striped blue bags, 4 striped beige bags, 4 dim violet bags, 4 muted blue bags.\n" +
            "vibrant brown bags contain 5 light purple bags, 1 bright orange bag.\n" +
            "faded yellow bags contain 2 dark salmon bags.\n" +
            "vibrant teal bags contain 5 vibrant brown bags, 5 shiny indigo bags.\n" +
            "drab black bags contain 4 bright magenta bags, 1 shiny green bag.\n" +
            "mirrored black bags contain 3 posh silver bags.\n" +
            "muted yellow bags contain 1 clear orange bag, 2 shiny gold bags, 4 wavy purple bags.\n" +
            "posh silver bags contain no other bags.\n" +
            "plaid coral bags contain 2 mirrored lavender bags, 5 drab lime bags, 4 pale brown bags, 4 dark maroon bags.\n" +
            "muted plum bags contain no other bags.\n" +
            "pale silver bags contain 2 dim brown bags, 1 light aqua bag, 4 shiny lavender bags.\n" +
            "dotted coral bags contain 2 dotted bronze bags, 1 clear violet bag, 1 vibrant magenta bag.\n" +
            "drab indigo bags contain 1 dotted crimson bag.\n" +
            "dim salmon bags contain 2 clear green bags, 4 muted chartreuse bags.\n" +
            "vibrant cyan bags contain 4 posh magenta bags, 4 clear violet bags.\n" +
            "muted olive bags contain 5 bright salmon bags, 2 dark silver bags.\n" +
            "drab blue bags contain 2 shiny yellow bags, 5 clear olive bags.\n" +
            "dark brown bags contain 3 muted cyan bags, 5 posh fuchsia bags.\n" +
            "dotted red bags contain 3 posh gray bags, 5 clear maroon bags, 3 posh fuchsia bags, 1 dark white bag.\n" +
            "light crimson bags contain 2 dark chartreuse bags.\n" +
            "wavy chartreuse bags contain 1 muted red bag, 5 dull chartreuse bags, 2 wavy bronze bags, 1 posh bronze bag.\n" +
            "plaid lime bags contain 3 pale white bags, 2 dull chartreuse bags, 3 plaid olive bags, 1 vibrant cyan bag.\n" +
            "striped gray bags contain 5 mirrored blue bags, 3 dark turquoise bags, 2 clear aqua bags, 5 drab cyan bags.\n" +
            "dull cyan bags contain no other bags.\n" +
            "dotted beige bags contain 5 dull cyan bags, 2 dull purple bags, 4 mirrored white bags, 3 vibrant olive bags.\n" +
            "pale turquoise bags contain 5 pale beige bags, 2 pale olive bags, 2 wavy coral bags, 5 light fuchsia bags.\n" +
            "muted tomato bags contain 1 vibrant olive bag, 1 bright purple bag, 3 pale turquoise bags, 3 striped coral bags.\n" +
            "pale white bags contain 4 dull gold bags, 5 wavy olive bags, 4 faded red bags, 2 plaid teal bags.\n" +
            "clear magenta bags contain 4 dark violet bags, 5 plaid chartreuse bags, 3 vibrant yellow bags.\n" +
            "vibrant tomato bags contain 2 posh lime bags, 4 drab orange bags, 1 striped turquoise bag.\n" +
            "striped green bags contain 1 dim purple bag, 3 dotted bronze bags, 4 bright bronze bags.\n" +
            "wavy salmon bags contain 1 shiny lime bag.\n" +
            "plaid purple bags contain 1 muted tomato bag, 2 shiny lavender bags, 5 light olive bags.\n" +
            "clear tan bags contain 2 striped plum bags, 1 striped fuchsia bag.\n" +
            "dull coral bags contain 5 bright orange bags, 5 faded purple bags, 5 plaid chartreuse bags, 3 muted green bags.\n" +
            "light tomato bags contain 4 faded tomato bags, 1 clear chartreuse bag, 2 plaid black bags, 2 posh plum bags.\n" +
            "dotted lime bags contain 3 bright lavender bags.\n" +
            "plaid blue bags contain 4 plaid black bags.\n" +
            "dull silver bags contain 1 wavy magenta bag, 2 mirrored fuchsia bags, 4 striped salmon bags.\n" +
            "dotted maroon bags contain 3 dull cyan bags, 5 plaid lavender bags, 3 bright gray bags.\n" +
            "bright black bags contain 4 mirrored plum bags, 2 drab blue bags, 3 light gray bags, 1 posh coral bag.\n" +
            "pale salmon bags contain 5 bright gray bags.\n" +
            "muted chartreuse bags contain 1 mirrored lavender bag.\n" +
            "pale lavender bags contain 4 dim black bags.\n" +
            "dull fuchsia bags contain 1 bright olive bag, 3 dull cyan bags, 3 bright tomato bags.\n" +
            "posh fuchsia bags contain 4 striped cyan bags, 1 shiny purple bag, 5 muted lavender bags.\n" +
            "dull tan bags contain 2 light magenta bags.\n" +
            "mirrored olive bags contain 5 clear maroon bags, 3 bright cyan bags, 2 vibrant plum bags.\n" +
            "plaid chartreuse bags contain 2 pale coral bags, 1 posh lime bag, 5 light olive bags, 2 bright orange bags.\n" +
            "muted teal bags contain 3 plaid teal bags.\n" +
            "dim violet bags contain 3 striped tomato bags, 1 dotted fuchsia bag.\n" +
            "striped yellow bags contain 2 mirrored brown bags, 3 faded cyan bags, 1 clear silver bag, 5 wavy orange bags.\n" +
            "faded salmon bags contain 5 striped coral bags.\n" +
            "striped turquoise bags contain no other bags.\n" +
            "dim white bags contain 5 clear coral bags.\n" +
            "dull violet bags contain 4 striped violet bags, 5 dotted olive bags, 4 pale gold bags, 2 vibrant olive bags.\n" +
            "posh plum bags contain 2 bright orange bags, 5 faded tomato bags, 3 pale brown bags, 1 posh silver bag.\n" +
            "wavy orange bags contain 3 dull maroon bags, 1 drab orange bag, 4 posh plum bags.\n" +
            "dotted purple bags contain 2 mirrored white bags.\n" +
            "dark indigo bags contain 3 muted green bags, 5 dark white bags, 4 drab olive bags, 5 vibrant tomato bags.\n" +
            "shiny silver bags contain 2 pale green bags.\n" +
            "shiny crimson bags contain 3 wavy chartreuse bags, 2 wavy olive bags.\n" +
            "dull salmon bags contain 5 plaid plum bags.\n" +
            "bright brown bags contain 4 clear tan bags.\n" +
            "wavy aqua bags contain 1 dotted tan bag, 4 bright turquoise bags, 1 wavy maroon bag, 4 shiny cyan bags.\n" +
            "mirrored cyan bags contain 1 pale green bag, 5 plaid chartreuse bags, 5 muted chartreuse bags, 1 faded purple bag.\n" +
            "dark yellow bags contain 5 mirrored crimson bags, 2 shiny beige bags, 5 mirrored brown bags, 4 muted aqua bags.\n" +
            "faded gray bags contain 5 wavy cyan bags, 2 dim olive bags, 5 wavy gray bags.\n" +
            "drab aqua bags contain 3 shiny purple bags, 2 dim gray bags, 3 wavy cyan bags.\n" +
            "vibrant salmon bags contain 2 light indigo bags, 4 pale maroon bags.\n" +
            "drab yellow bags contain 1 light purple bag, 5 muted fuchsia bags, 2 drab blue bags, 4 muted green bags.\n" +
            "dark maroon bags contain 4 posh coral bags.\n" +
            "drab orange bags contain 4 bright tomato bags, 4 faded purple bags, 5 pale brown bags.\n" +
            "dim teal bags contain 4 shiny gray bags.\n" +
            "dotted bronze bags contain 2 drab blue bags, 1 light magenta bag.\n" +
            "faded maroon bags contain 5 wavy cyan bags, 1 pale gold bag.\n" +
            "vibrant gray bags contain 3 dull coral bags, 4 faded lime bags, 3 mirrored turquoise bags.\n" +
            "wavy yellow bags contain 3 striped bronze bags.\n" +
            "mirrored white bags contain no other bags.\n" +
            "pale chartreuse bags contain 5 drab blue bags, 3 bright black bags, 1 mirrored lavender bag, 4 dotted magenta bags.\n" +
            "posh crimson bags contain 1 mirrored lavender bag, 1 clear cyan bag.\n" +
            "dim coral bags contain 2 posh brown bags.\n" +
            "striped crimson bags contain 3 dim gray bags, 1 light turquoise bag, 3 wavy bronze bags, 4 faded orange bags.\n" +
            "posh violet bags contain 1 dark teal bag, 4 posh red bags, 3 vibrant lime bags.\n" +
            "light salmon bags contain 3 plaid salmon bags.\n" +
            "plaid red bags contain 2 dull lavender bags, 1 posh plum bag, 4 faded cyan bags, 1 plaid turquoise bag.\n" +
            "pale maroon bags contain 1 plaid turquoise bag, 4 faded maroon bags, 4 shiny yellow bags, 1 pale purple bag.\n" +
            "striped magenta bags contain 2 posh turquoise bags, 5 wavy indigo bags, 4 plaid tomato bags, 3 dim lavender bags.\n" +
            "striped silver bags contain no other bags.\n" +
            "striped gold bags contain 5 bright brown bags, 1 dotted crimson bag, 2 bright olive bags.\n" +
            "clear turquoise bags contain 3 wavy teal bags, 2 muted red bags.\n" +
            "mirrored tan bags contain 5 dark yellow bags, 3 posh coral bags.\n" +
            "shiny blue bags contain 2 dull olive bags, 2 muted brown bags.\n" +
            "clear black bags contain 2 wavy teal bags, 5 plaid chartreuse bags, 4 dull coral bags, 5 dark yellow bags.\n" +
            "faded gold bags contain 5 muted teal bags, 3 bright white bags, 4 striped tan bags.\n" +
            "drab tan bags contain 1 faded black bag, 2 clear olive bags.\n" +
            "dark cyan bags contain 1 plaid black bag, 1 muted aqua bag, 5 bright fuchsia bags.\n" +
            "muted silver bags contain 1 clear olive bag, 5 striped indigo bags.\n" +
            "dim beige bags contain 1 muted tomato bag, 5 clear fuchsia bags, 1 faded coral bag.\n" +
            "striped red bags contain 3 plaid brown bags, 4 posh black bags, 2 dotted gray bags.\n" +
            "striped purple bags contain 5 light lavender bags, 2 dotted brown bags, 1 dull olive bag, 2 shiny aqua bags.\n" +
            "shiny orange bags contain 3 mirrored brown bags, 1 wavy bronze bag, 5 vibrant aqua bags.\n" +
            "striped salmon bags contain 4 bright silver bags.\n" +
            "shiny olive bags contain 4 pale gold bags, 5 drab indigo bags, 3 mirrored salmon bags, 2 muted gray bags.\n" +
            "pale bronze bags contain 3 clear cyan bags, 3 drab blue bags, 5 drab bronze bags, 4 shiny gray bags.\n" +
            "plaid aqua bags contain 5 pale yellow bags, 4 pale black bags, 3 muted red bags.\n" +
            "faded coral bags contain 3 dark bronze bags, 5 striped silver bags, 5 clear olive bags, 2 wavy gray bags.\n" +
            "striped bronze bags contain 4 posh orange bags.\n" +
            "bright violet bags contain 5 light white bags, 1 dull olive bag, 5 drab fuchsia bags, 3 dim chartreuse bags.\n" +
            "wavy bronze bags contain 2 dark tomato bags, 2 muted red bags, 1 drab orange bag.\n" +
            "pale beige bags contain 5 muted lavender bags, 1 vibrant aqua bag, 4 drab lime bags.\n" +
            "dim crimson bags contain 4 plaid plum bags.\n" +
            "light silver bags contain 3 shiny yellow bags, 4 dull fuchsia bags, 4 dark chartreuse bags, 1 bright orange bag.\n" +
            "dark coral bags contain 1 clear indigo bag, 1 muted gold bag, 5 pale lime bags.\n" +
            "striped plum bags contain 5 plaid white bags, 3 pale gold bags, 3 pale yellow bags, 2 dim orange bags.\n" +
            "light tan bags contain 5 dark crimson bags, 1 clear silver bag, 2 striped tomato bags, 1 vibrant magenta bag.\n" +
            "shiny brown bags contain 4 bright bronze bags.\n" +
            "faded red bags contain 2 dotted bronze bags.\n" +
            "dim gray bags contain 1 pale gold bag, 5 shiny orange bags.\n" +
            "mirrored plum bags contain 2 muted plum bags, 1 posh silver bag.\n" +
            "shiny yellow bags contain 4 faded black bags, 4 light olive bags.\n" +
            "posh bronze bags contain 3 posh orange bags.\n" +
            "clear lime bags contain 5 mirrored lavender bags, 1 dark tomato bag, 4 dim aqua bags, 1 pale purple bag.\n" +
            "drab red bags contain 3 dark tan bags, 2 shiny maroon bags, 2 mirrored purple bags, 5 dotted orange bags.\n" +
            "dull purple bags contain 1 striped yellow bag, 3 faded cyan bags, 5 pale red bags, 4 plaid green bags.\n" +
            "muted magenta bags contain 1 drab yellow bag, 1 dark lavender bag.\n" +
            "dim fuchsia bags contain 4 pale aqua bags, 3 mirrored indigo bags, 2 wavy lime bags.\n" +
            "muted black bags contain 3 bright turquoise bags, 3 plaid cyan bags, 5 dim cyan bags.\n" +
            "dark lime bags contain 1 posh orange bag.\n" +
            "drab bronze bags contain 1 pale tomato bag, 4 light purple bags, 1 light olive bag, 4 posh silver bags.\n" +
            "posh tan bags contain 5 bright gold bags.\n" +
            "dim lavender bags contain 1 mirrored white bag, 4 posh lime bags, 3 dark fuchsia bags.\n" +
            "dark fuchsia bags contain no other bags.\n" +
            "muted maroon bags contain 2 bright white bags, 4 dark salmon bags, 4 posh gray bags, 4 posh plum bags.\n" +
            "dotted crimson bags contain 2 plaid salmon bags.\n" +
            "drab olive bags contain 2 dull lavender bags, 3 dark tomato bags.\n" +
            "wavy crimson bags contain 3 clear orange bags, 5 dull maroon bags.\n" +
            "dark silver bags contain 1 muted red bag, 5 dim bronze bags.\n" +
            "dull magenta bags contain 2 mirrored cyan bags, 2 mirrored plum bags, 1 drab olive bag.\n" +
            "pale magenta bags contain 4 dark olive bags, 1 wavy teal bag.\n" +
            "plaid crimson bags contain 1 dim purple bag, 1 shiny gold bag, 5 shiny tan bags, 2 striped silver bags.\n" +
            "vibrant magenta bags contain 3 striped turquoise bags.\n" +
            "light brown bags contain 2 clear magenta bags, 2 light lime bags.\n" +
            "drab lime bags contain 2 striped aqua bags.\n" +
            "light aqua bags contain 2 dim orange bags, 5 mirrored brown bags, 4 vibrant tomato bags.\n" +
            "dotted white bags contain 3 faded plum bags, 1 striped lime bag.\n" +
            "muted orange bags contain 4 clear purple bags, 5 light indigo bags, 1 plaid bronze bag.\n" +
            "dark turquoise bags contain 2 clear cyan bags.\n" +
            "striped beige bags contain 3 wavy yellow bags, 2 clear brown bags, 1 faded plum bag, 2 dotted bronze bags.\n" +
            "bright chartreuse bags contain 2 dim cyan bags, 2 faded lavender bags, 3 muted yellow bags, 1 dotted turquoise bag.\n" +
            "bright beige bags contain 3 vibrant silver bags, 3 faded bronze bags, 4 bright lime bags, 5 plaid lavender bags.\n" +
            "pale orange bags contain 1 striped tomato bag, 3 pale brown bags, 5 plaid bronze bags, 4 dark salmon bags.\n" +
            "dim black bags contain 4 striped turquoise bags, 2 plaid chartreuse bags, 5 posh red bags, 1 bright tomato bag.\n" +
            "plaid olive bags contain 5 dark indigo bags, 1 dark teal bag.\n" +
            "plaid orange bags contain 5 muted plum bags, 4 dark tomato bags, 5 dull crimson bags.\n" +
            "dark purple bags contain 3 pale beige bags, 4 pale gold bags, 1 vibrant blue bag.\n" +
            "mirrored salmon bags contain 3 plaid red bags, 3 dark plum bags.\n" +
            "vibrant aqua bags contain 3 clear maroon bags, 1 striped silver bag, 5 shiny gold bags, 3 faded tomato bags.\n" +
            "dull lavender bags contain 3 faded white bags, 1 dim lavender bag, 2 dull fuchsia bags.\n" +
            "posh green bags contain 5 dim orange bags.\n" +
            "clear salmon bags contain 4 bright black bags, 5 dotted plum bags, 2 striped tomato bags.\n" +
            "mirrored violet bags contain 2 wavy black bags, 5 dotted gold bags, 3 posh brown bags.\n" +
            "faded magenta bags contain 2 vibrant crimson bags, 5 drab orange bags, 1 dark gray bag, 4 striped coral bags.\n" +
            "light plum bags contain 4 muted plum bags.\n" +
            "dotted tan bags contain 1 wavy gray bag.\n" +
            "dim tan bags contain 5 mirrored bronze bags, 3 drab olive bags, 2 wavy olive bags, 3 dark tan bags.\n" +
            "striped indigo bags contain 2 drab green bags, 1 light olive bag, 5 bright orange bags.\n" +
            "vibrant orange bags contain 4 dull fuchsia bags, 1 shiny violet bag.\n" +
            "dim lime bags contain 5 striped silver bags.\n" +
            "plaid gray bags contain 4 dark tan bags, 3 dark magenta bags, 2 drab black bags, 3 faded bronze bags.\n" +
            "faded chartreuse bags contain 2 clear beige bags, 2 light beige bags.\n" +
            "striped orange bags contain 5 mirrored coral bags, 4 light gray bags, 2 mirrored white bags.\n" +
            "dim silver bags contain 3 posh coral bags, 4 dotted bronze bags, 4 muted yellow bags, 1 faded gray bag.\n" +
            "dotted gold bags contain 1 posh gray bag.\n" +
            "dotted olive bags contain 5 faded aqua bags, 4 faded brown bags, 2 dim salmon bags.\n" +
            "posh maroon bags contain 4 striped aqua bags, 1 wavy yellow bag, 1 mirrored crimson bag.\n" +
            "dark orange bags contain 3 mirrored fuchsia bags, 1 light magenta bag, 2 muted bronze bags, 2 wavy blue bags.\n" +
            "pale purple bags contain 4 dotted blue bags.\n" +
            "muted indigo bags contain 1 dark fuchsia bag, 2 posh fuchsia bags, 5 plaid turquoise bags, 2 mirrored cyan bags.\n" +
            "faded tan bags contain 1 drab fuchsia bag, 3 dark beige bags.\n" +
            "bright cyan bags contain 3 dotted blue bags, 5 muted plum bags, 2 vibrant crimson bags, 3 dark gold bags.\n" +
            "mirrored gray bags contain 3 pale lavender bags, 2 shiny blue bags, 4 dark salmon bags.\n" +
            "dotted violet bags contain 4 posh red bags, 4 bright tomato bags, 3 muted plum bags.\n" +
            "pale tan bags contain 2 clear crimson bags, 4 drab lime bags.\n" +
            "dull tomato bags contain 2 drab green bags, 5 dark crimson bags.\n" +
            "wavy coral bags contain 3 light aqua bags, 3 bright blue bags, 1 posh gray bag.\n" +
            "dull aqua bags contain 4 drab brown bags.\n" +
            "clear white bags contain 5 dark indigo bags, 5 dark maroon bags, 1 striped orange bag, 2 shiny gold bags.\n" +
            "dotted magenta bags contain 3 light olive bags, 4 dark indigo bags, 3 dotted blue bags, 3 striped lime bags.\n" +
            "plaid cyan bags contain 3 wavy olive bags, 5 dim black bags, 4 dotted bronze bags, 2 striped tomato bags.\n" +
            "muted lime bags contain 3 pale turquoise bags, 1 posh white bag.\n" +
            "wavy teal bags contain 2 dim orange bags.\n" +
            "muted gold bags contain 1 pale aqua bag, 4 shiny beige bags, 2 light olive bags.\n" +
            "wavy magenta bags contain 2 wavy purple bags, 5 wavy tomato bags.\n" +
            "dim maroon bags contain 5 plaid red bags.\n" +
            "drab green bags contain 5 light gray bags, 4 clear maroon bags, 2 dark indigo bags.\n" +
            "plaid lavender bags contain 5 drab blue bags.\n" +
            "light white bags contain 4 light tan bags.\n" +
            "wavy gray bags contain 1 posh coral bag.\n" +
            "mirrored teal bags contain 5 clear brown bags, 4 bright magenta bags, 1 drab brown bag, 2 dull gold bags.\n" +
            "light black bags contain 1 posh coral bag, 4 dotted black bags, 4 posh lime bags, 4 bright blue bags.\n" +
            "shiny gray bags contain 2 dotted blue bags, 5 striped turquoise bags, 4 pale aqua bags, 1 dim black bag.\n" +
            "posh lavender bags contain 1 wavy yellow bag, 2 dotted tan bags, 3 dull lavender bags.\n" +
            "faded beige bags contain 5 posh brown bags, 1 vibrant indigo bag, 2 light cyan bags, 1 clear aqua bag.\n" +
            "clear lavender bags contain 1 dull salmon bag.\n" +
            "mirrored coral bags contain 2 light olive bags, 5 clear olive bags, 2 pale tomato bags.\n" +
            "bright white bags contain 5 wavy yellow bags, 5 wavy bronze bags, 1 wavy olive bag, 5 muted red bags.\n" +
            "dark lavender bags contain 5 pale tomato bags, 4 faded white bags.\n" +
            "light red bags contain 3 posh turquoise bags, 3 dull indigo bags, 3 wavy silver bags, 2 drab salmon bags.\n" +
            "vibrant violet bags contain 1 shiny orange bag.\n" +
            "clear gold bags contain 1 drab magenta bag, 4 plaid tan bags, 2 vibrant yellow bags.\n" +
            "striped white bags contain 5 light salmon bags, 1 mirrored purple bag.\n" +
            "vibrant maroon bags contain 4 striped coral bags.\n" +
            "bright olive bags contain 2 light gray bags, 1 posh silver bag, 2 bright orange bags, 1 dark fuchsia bag.\n" +
            "mirrored gold bags contain 1 drab black bag.\n" +
            "shiny green bags contain 4 posh purple bags.\n" +
            "dim aqua bags contain 4 pale gold bags, 1 dull coral bag, 3 faded teal bags, 2 pale yellow bags.\n" +
            "dotted tomato bags contain 4 dull salmon bags.\n" +
            "faded olive bags contain 5 muted green bags, 1 drab crimson bag.\n" +
            "striped teal bags contain 4 dotted green bags, 5 muted aqua bags.\n" +
            "pale crimson bags contain 1 striped lime bag, 4 mirrored tan bags, 2 clear lavender bags.\n" +
            "shiny salmon bags contain 2 muted salmon bags, 5 shiny cyan bags, 4 faded red bags, 5 light tan bags.\n" +
            "plaid brown bags contain 5 pale orange bags.\n" +
            "posh gold bags contain 3 shiny crimson bags.\n" +
            "wavy violet bags contain 5 muted olive bags.\n" +
            "drab white bags contain 3 posh brown bags, 2 striped cyan bags, 1 clear coral bag.\n" +
            "light magenta bags contain 2 clear maroon bags, 3 light gray bags, 2 dotted black bags, 4 bright fuchsia bags.\n" +
            "bright aqua bags contain 4 plaid cyan bags, 2 clear black bags.\n" +
            "muted green bags contain 5 striped silver bags, 5 bright orange bags.\n" +
            "dim cyan bags contain 5 plaid brown bags, 3 striped tan bags.\n" +
            "vibrant olive bags contain 5 dark yellow bags.\n" +
            "dark tan bags contain 1 muted lavender bag, 2 mirrored turquoise bags, 1 dim lime bag, 1 dull olive bag.\n" +
            "mirrored brown bags contain 3 pale brown bags.\n" +
            "mirrored aqua bags contain 1 mirrored plum bag, 3 dark maroon bags.\n" +
            "clear cyan bags contain 1 dull cyan bag, 2 dark tomato bags, 4 pale brown bags.\n" +
            "dull yellow bags contain 4 wavy coral bags, 4 striped tan bags, 3 muted chartreuse bags.\n" +
            "mirrored maroon bags contain 3 plaid tomato bags, 4 shiny purple bags, 1 plaid lavender bag, 5 light gray bags.\n" +
            "drab coral bags contain 2 dark turquoise bags, 2 clear crimson bags, 4 drab lime bags, 5 dull crimson bags.\n" +
            "muted turquoise bags contain 5 posh purple bags, 2 dim magenta bags.\n" +
            "dull turquoise bags contain 4 striped aqua bags, 2 light fuchsia bags, 3 pale turquoise bags, 2 faded maroon bags.\n" +
            "bright maroon bags contain 1 muted red bag, 3 faded black bags.\n" +
            "wavy indigo bags contain 3 shiny beige bags, 5 dim lavender bags, 2 striped tan bags.\n" +
            "pale red bags contain 1 vibrant brown bag, 3 faded black bags, 4 posh turquoise bags, 5 plaid brown bags.\n" +
            "drab teal bags contain 1 faded purple bag, 2 mirrored blue bags, 2 vibrant tomato bags, 1 pale purple bag.\n" +
            "faded purple bags contain 1 vibrant white bag.\n" +
            "striped maroon bags contain 1 mirrored brown bag, 1 shiny black bag, 5 dotted lime bags.\n" +
            "dotted chartreuse bags contain 3 dim blue bags.\n" +
            "posh black bags contain 3 light aqua bags, 5 bright orange bags, 1 plaid plum bag, 5 plaid fuchsia bags.\n" +
            "pale gold bags contain 1 faded tomato bag, 2 dark tomato bags, 3 dotted blue bags.\n" +
            "muted brown bags contain 1 plaid brown bag.\n" +
            "vibrant purple bags contain 1 shiny gray bag, 5 dull green bags.\n" +
            "mirrored purple bags contain 1 bright gray bag, 2 plaid plum bags, 5 dotted chartreuse bags, 2 posh lime bags.\n" +
            "bright coral bags contain 3 dim blue bags.\n" +
            "dark magenta bags contain 4 muted maroon bags, 2 dark olive bags, 1 dull olive bag.\n" +
            "pale brown bags contain 2 faded purple bags, 1 muted green bag, 3 dark fuchsia bags.\n" +
            "drab gold bags contain 3 posh bronze bags, 2 plaid tomato bags.\n" +
            "pale teal bags contain 1 clear turquoise bag, 4 muted yellow bags, 1 posh tomato bag, 3 vibrant orange bags.\n" +
            "vibrant black bags contain 1 faded tomato bag, 5 dim white bags, 2 drab aqua bags, 1 vibrant silver bag.\n" +
            "dull black bags contain 3 pale yellow bags, 4 clear aqua bags, 1 shiny yellow bag, 3 faded maroon bags.\n" +
            "drab tomato bags contain 2 dim purple bags, 5 plaid fuchsia bags.\n" +
            "bright blue bags contain 5 posh silver bags, 4 dull cyan bags, 4 light olive bags, 1 mirrored white bag.\n" +
            "muted crimson bags contain 3 bright orange bags, 1 pale tomato bag, 3 posh yellow bags, 4 shiny purple bags.\n" +
            "shiny plum bags contain 1 dim turquoise bag.\n" +
            "clear maroon bags contain 1 posh red bag, 2 light olive bags, 1 dotted purple bag.\n" +
            "drab chartreuse bags contain 4 dotted green bags, 1 dark red bag.\n" +
            "dull brown bags contain 5 dim lavender bags, 4 bright tomato bags, 5 drab crimson bags, 1 vibrant tomato bag.\n" +
            "wavy purple bags contain 4 dim lavender bags, 2 plaid plum bags, 2 dim lime bags, 2 striped cyan bags.\n" +
            "vibrant coral bags contain 1 striped crimson bag, 3 drab cyan bags, 5 vibrant yellow bags, 2 dotted teal bags.\n" +
            "clear crimson bags contain 4 dotted purple bags, 5 faded cyan bags.\n" +
            "clear coral bags contain 4 clear chartreuse bags, 2 bright olive bags.\n" +
            "light cyan bags contain 3 shiny violet bags, 3 dotted blue bags, 3 drab beige bags.\n" +
            "light fuchsia bags contain 2 plaid lavender bags, 4 dull green bags, 2 plaid salmon bags.\n" +
            "dull bronze bags contain 3 bright magenta bags, 1 bright black bag, 2 wavy lime bags.\n" +
            "light gold bags contain 5 bright indigo bags.\n" +
            "drab magenta bags contain 5 faded fuchsia bags, 2 dim black bags, 5 dim crimson bags, 5 dotted fuchsia bags.\n" +
            "mirrored lime bags contain 2 mirrored white bags, 1 shiny gray bag.\n" +
            "dim olive bags contain 4 bright blue bags, 1 faded tomato bag.\n" +
            "striped tan bags contain 4 dark tomato bags, 4 mirrored coral bags, 2 mirrored lavender bags.\n" +
            "muted coral bags contain 4 pale salmon bags, 3 faded purple bags.\n" +
            "striped violet bags contain 4 dark gray bags, 3 posh coral bags, 2 striped turquoise bags, 4 bright fuchsia bags.\n" +
            "clear plum bags contain 3 bright cyan bags, 1 drab salmon bag, 2 vibrant brown bags.\n" +
            "clear brown bags contain 1 mirrored plum bag.\n" +
            "light indigo bags contain 4 drab blue bags, 5 mirrored chartreuse bags, 2 muted red bags, 2 dark beige bags.\n" +
            "dim purple bags contain 4 wavy teal bags.\n" +
            "clear yellow bags contain 4 clear maroon bags, 3 bright olive bags, 5 shiny gray bags, 2 bright orange bags.\n" +
            "pale tomato bags contain 2 dotted violet bags, 2 dark teal bags.\n" +
            "bright teal bags contain 2 shiny maroon bags, 2 muted indigo bags.\n" +
            "pale plum bags contain 5 posh gray bags, 3 shiny indigo bags, 3 wavy olive bags, 1 pale white bag.\n" +
            "dark teal bags contain 3 muted plum bags, 4 faded plum bags, 1 wavy bronze bag.\n" +
            "vibrant crimson bags contain 5 dark tomato bags, 2 dark white bags, 5 posh red bags.\n" +
            "shiny aqua bags contain 1 pale coral bag.\n" +
            "dim chartreuse bags contain 2 wavy teal bags, 5 mirrored black bags, 5 mirrored bronze bags, 4 muted lavender bags.\n" +
            "drab beige bags contain 2 faded coral bags, 5 muted tan bags, 5 plaid cyan bags.\n" +
            "bright purple bags contain 4 muted red bags, 5 wavy beige bags, 4 clear coral bags.\n" +
            "striped black bags contain 3 light red bags, 2 plaid chartreuse bags.\n" +
            "striped chartreuse bags contain 2 dotted gray bags, 2 wavy olive bags, 1 muted lavender bag.\n" +
            "dull gold bags contain 5 wavy olive bags, 2 posh plum bags, 4 shiny gold bags.\n" +
            "striped lavender bags contain 5 dim teal bags, 3 light blue bags.\n" +
            "striped lime bags contain 4 light black bags, 5 striped turquoise bags, 5 wavy cyan bags.";
}
