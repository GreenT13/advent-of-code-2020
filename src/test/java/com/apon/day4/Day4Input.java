package com.apon.day4;

public class Day4Input {
    public final static String EXAMPLE_INPUT = "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\n" +
            "byr:1937 iyr:2017 cid:147 hgt:183cm\n" +
            "\n" +
            "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\n" +
            "hcl:#cfa07d byr:1929\n" +
            "\n" +
            "hcl:#ae17e1 iyr:2013\n" +
            "eyr:2024\n" +
            "ecl:brn pid:760753108 byr:1931\n" +
            "hgt:179cm\n" +
            "\n" +
            "hcl:#cfa07d eyr:2025 pid:166559648\n" +
            "iyr:2011 ecl:brn hgt:59in";

    public final static String PART2_INVALID_EXAMPLES = "eyr:1972 cid:100\n" +
            "hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926\n" +
            "\n" +
            "iyr:2019\n" +
            "hcl:#602927 eyr:1967 hgt:170cm\n" +
            "ecl:grn pid:012533040 byr:1946\n" +
            "\n" +
            "hcl:dab227 iyr:2012\n" +
            "ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277\n" +
            "\n" +
            "hgt:59cm ecl:zzz\n" +
            "eyr:2038 hcl:74454a iyr:2023\n" +
            "pid:3556412378 byr:2007";

    public final static String PART2_VALID_EXAMPLES = "pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980\n" +
            "hcl:#623a2f\n" +
            "\n" +
            "eyr:2029 ecl:blu cid:129 byr:1989\n" +
            "iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm\n" +
            "\n" +
            "hcl:#888785\n" +
            "hgt:164cm byr:2001 iyr:2015 cid:88\n" +
            "pid:545766238 ecl:hzl\n" +
            "eyr:2022\n" +
            "\n" +
            "iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719";

    public final static String INPUT = "hcl:#6b5442 ecl:brn iyr:2019\n" +
            "pid:637485594 hgt:171cm\n" +
            "eyr:2021 byr:1986\n" +
            "\n" +
            "eyr:2025 iyr:1938 byr:2014 hcl:#341e13\n" +
            "hgt:66cm\n" +
            "pid:70195175\n" +
            "\n" +
            "hcl:#efcc98\n" +
            "iyr:2011 ecl:hzl\n" +
            "eyr:2020 hgt:174cm pid:589700330\n" +
            "\n" +
            "hcl:#bba027 eyr:2027 cid:54\n" +
            "ecl:brn pid:153cm\n" +
            "iyr:2028 hgt:173cm\n" +
            "byr:2004\n" +
            "\n" +
            "hcl:b45cec\n" +
            "iyr:2011 ecl:oth hgt:185cm eyr:2029 pid:178cm\n" +
            "\n" +
            "hgt:185cm iyr:2016 eyr:2029 hcl:#888785 pid:026540921\n" +
            "\n" +
            "eyr:2025\n" +
            "hcl:6962f7 byr:2015 ecl:oth iyr:1974\n" +
            "hgt:191cm\n" +
            "pid:2616015\n" +
            "\n" +
            "pid:268398556 iyr:2019 ecl:grn\n" +
            "eyr:2027 byr:1951 hcl:#18171d hgt:67cm\n" +
            "\n" +
            "eyr:2029 hgt:153cm ecl:brn pid:183179186 byr:2013 hcl:#623a2f\n" +
            "iyr:1957\n" +
            "\n" +
            "cid:121 iyr:1922 hcl:752fbc pid:79577560 byr:2025\n" +
            "hgt:61cm eyr:1971\n" +
            "\n" +
            "iyr:2016\n" +
            "eyr:2024 hcl:#18171d hgt:184cm\n" +
            "ecl:hzl byr:1992 pid:751161201\n" +
            "\n" +
            "eyr:2021 ecl:blu byr:1938 iyr:2016 hcl:#b6652a pid:313406514 hgt:191cm\n" +
            "\n" +
            "hcl:#623a2f eyr:2021\n" +
            "ecl:brn\n" +
            "pid:145249653 hgt:167cm iyr:2019 byr:1991\n" +
            "\n" +
            "iyr:2022 pid:175cm\n" +
            "byr:2021 eyr:2027 ecl:#f615b1\n" +
            "hgt:172in hcl:#ceb3a1\n" +
            "\n" +
            "hgt:173in\n" +
            "ecl:#0cba5e pid:1885981567 iyr:1968\n" +
            "byr:1952\n" +
            "eyr:1942\n" +
            "\n" +
            "ecl:oth eyr:2023 hgt:65cm pid:521737908 byr:1971 hcl:z iyr:2017\n" +
            "\n" +
            "byr:1936\n" +
            "hcl:#cfa07d\n" +
            "ecl:brn iyr:2011 pid:589047874\n" +
            "eyr:2025\n" +
            "\n" +
            "hcl:#fffffd\n" +
            "pid:912552538\n" +
            "cid:159 hgt:160cm iyr:2012\n" +
            "eyr:2023 ecl:hzl\n" +
            "byr:1946\n" +
            "\n" +
            "iyr:2015\n" +
            "ecl:amb hgt:72in\n" +
            "cid:59 pid:782818257 hcl:#18171d eyr:2026\n" +
            "byr:1952\n" +
            "\n" +
            "hgt:173cm iyr:2018 cid:96 ecl:amb byr:1986 pid:783160698 eyr:2026\n" +
            "hcl:#602927\n" +
            "\n" +
            "hcl:#a97842 cid:199 pid:912273414 eyr:2030\n" +
            "hgt:171cm ecl:hzl iyr:2011 byr:1960\n" +
            "\n" +
            "ecl:amb hgt:156cm\n" +
            "iyr:2013\n" +
            "hcl:#ceb3a1\n" +
            "cid:116 pid:567057004 byr:1942\n" +
            "eyr:2029\n" +
            "\n" +
            "ecl:#cddc40\n" +
            "pid:045090966 cid:254\n" +
            "hgt:75in hcl:#733820 eyr:2026 byr:1956\n" +
            "iyr:2015\n" +
            "\n" +
            "pid:156cm\n" +
            "eyr:2040\n" +
            "hgt:176cm ecl:#02e67d hcl:b7c0e6\n" +
            "iyr:1959 cid:129 byr:2022\n" +
            "\n" +
            "hgt:160cm byr:1933\n" +
            "ecl:blu eyr:2029 iyr:2012 hcl:#888785 pid:028571975\n" +
            "\n" +
            "iyr:2017\n" +
            "hcl:#390f37 hgt:171cm ecl:brn byr:1931 pid:015365720 eyr:2030\n" +
            "\n" +
            "iyr:2014 pid:697057757\n" +
            "eyr:2026 hgt:188cm\n" +
            "ecl:gry byr:1926\n" +
            "\n" +
            "pid:484310015 hcl:#fffffd hgt:150cm iyr:2018\n" +
            "cid:53 ecl:gry eyr:2021 byr:1957\n" +
            "\n" +
            "hgt:156cm\n" +
            "eyr:2026 byr:1963\n" +
            "pid:063272603 ecl:brn iyr:2011\n" +
            "hcl:#888785\n" +
            "\n" +
            "byr:1955 pid:310518398 hgt:191cm iyr:2018\n" +
            "ecl:oth eyr:2023 cid:132 hcl:#888785\n" +
            "\n" +
            "byr:1938 hcl:#623a2f eyr:2023\n" +
            "iyr:2010\n" +
            "hgt:165cm\n" +
            "pid:170304863\n" +
            "cid:290 ecl:amb\n" +
            "\n" +
            "eyr:2026\n" +
            "pid:021468065 hgt:164cm\n" +
            "byr:1996 iyr:2016 hcl:#18171d\n" +
            "ecl:brn\n" +
            "\n" +
            "byr:2027 ecl:oth pid:8258823391 hgt:153in hcl:#733820 eyr:1948\n" +
            "\n" +
            "byr:2026 ecl:#cd275a iyr:2012 eyr:2036 pid:5917499975\n" +
            "\n" +
            "byr:2004\n" +
            "cid:151\n" +
            "hcl:99ecb1\n" +
            "eyr:2033 pid:871137711 iyr:1997\n" +
            "hgt:184cm ecl:oth\n" +
            "\n" +
            "byr:2011\n" +
            "hcl:z ecl:#eee1d2 hgt:59cm eyr:1925 iyr:2030 pid:#02ee78\n" +
            "\n" +
            "pid:742658992\n" +
            "hcl:#888785\n" +
            "byr:1995\n" +
            "eyr:2024 hgt:162cm iyr:2013 cid:169 ecl:gry\n" +
            "\n" +
            "hgt:152cm byr:1946\n" +
            "eyr:2027 iyr:2018\n" +
            "pid:352799678\n" +
            "hcl:#238da0\n" +
            "ecl:amb\n" +
            "cid:71\n" +
            "\n" +
            "hcl:#623a2f pid:723616064 eyr:2021\n" +
            "hgt:172cm\n" +
            "byr:1926 iyr:2013\n" +
            "ecl:grn\n" +
            "\n" +
            "iyr:2019 hgt:94 byr:2028 eyr:1986\n" +
            "pid:#ee7f00\n" +
            "\n" +
            "ecl:amb\n" +
            "eyr:2027 pid:188153423 byr:1957 hcl:#d67ae1\n" +
            "iyr:2011 hgt:183cm\n" +
            "\n" +
            "byr:1950 ecl:#e2495d iyr:2010 hgt:166cm eyr:2034 pid:151457075\n" +
            "\n" +
            "eyr:1981\n" +
            "byr:2016 iyr:2029 pid:153cm ecl:#55c2a4 hcl:z\n" +
            "hgt:76cm\n" +
            "\n" +
            "hgt:184cm ecl:amb eyr:2021\n" +
            "hcl:#623a2f\n" +
            "pid:414607669 iyr:1960 byr:2002\n" +
            "\n" +
            "eyr:2027 iyr:2020 hgt:179cm byr:1991\n" +
            "pid:969568248\n" +
            "ecl:blu\n" +
            "\n" +
            "hgt:175cm pid:536803427 hcl:#a97842 iyr:2012\n" +
            "ecl:grn byr:1950 eyr:2027\n" +
            "\n" +
            "eyr:2028 hgt:60in hcl:#733820 iyr:2018 ecl:oth pid:871909483\n" +
            "byr:1930\n" +
            "\n" +
            "hgt:155cm iyr:2020 byr:1960 eyr:2021\n" +
            "pid:515710074 ecl:amb hcl:#341e13\n" +
            "\n" +
            "byr:1922 hcl:z iyr:1977 ecl:brn\n" +
            "eyr:2023 hgt:119 pid:865700639\n" +
            "\n" +
            "ecl:gry hcl:959fcd pid:#633ac1\n" +
            "byr:2011 hgt:68in\n" +
            "eyr:2020\n" +
            "\n" +
            "iyr:1972 hcl:z cid:149 byr:2020\n" +
            "hgt:166in pid:4548657 eyr:1960\n" +
            "ecl:#cc987c\n" +
            "\n" +
            "eyr:2023 hcl:#b6652a iyr:2015\n" +
            "hgt:187in pid:547953710 byr:1979 ecl:grn\n" +
            "\n" +
            "iyr:2018\n" +
            "pid:508691429 ecl:oth eyr:2025 hgt:187cm cid:270\n" +
            "hcl:#888785 byr:1977\n" +
            "\n" +
            "hgt:168cm eyr:2032 byr:2020\n" +
            "ecl:gry iyr:1982\n" +
            "hcl:z pid:648015564\n" +
            "\n" +
            "hcl:#fffffd pid:911858643 iyr:2016 ecl:gry eyr:2030 byr:1992 hgt:156cm\n" +
            "\n" +
            "pid:241562994 eyr:2026 ecl:grn hgt:164cm\n" +
            "hcl:#c0946f byr:1945 iyr:2015 cid:296\n" +
            "\n" +
            "byr:1976 pid:269322775 ecl:hzl\n" +
            "hgt:162cm hcl:#b6652a\n" +
            "eyr:2022 cid:335 iyr:2012\n" +
            "\n" +
            "eyr:2028\n" +
            "hgt:106\n" +
            "pid:268626219 hcl:#a97842\n" +
            "iyr:2011\n" +
            "ecl:grn byr:1967\n" +
            "\n" +
            "iyr:2016 hcl:#888785 hgt:193cm ecl:oth\n" +
            "pid:034099334 eyr:2027\n" +
            "byr:1945\n" +
            "cid:181\n" +
            "\n" +
            "pid:248319556 byr:1987 iyr:2010 cid:122 ecl:utc\n" +
            "hcl:z hgt:190cm eyr:2030\n" +
            "\n" +
            "iyr:2019 hcl:#ceb3a1\n" +
            "ecl:hzl\n" +
            "cid:281 hgt:73in byr:1992\n" +
            "eyr:2023\n" +
            "\n" +
            "hcl:#fffffd\n" +
            "ecl:blu cid:340 hgt:176cm byr:1980 pid:809878309 iyr:2018\n" +
            "\n" +
            "hgt:167cm hcl:#866857 byr:1973 cid:143 eyr:2030 iyr:2012\n" +
            "ecl:hzl pid:168618514\n" +
            "\n" +
            "hcl:c97d76 iyr:2016 pid:8439355994 byr:2013 eyr:2036 hgt:71cm\n" +
            "cid:116 ecl:#055b62\n" +
            "\n" +
            "hcl:#341e13 pid:961548527 eyr:2027 hgt:192cm byr:1940 iyr:2011 ecl:oth\n" +
            "\n" +
            "byr:1935 hgt:189cm ecl:brn iyr:2012\n" +
            "eyr:2028 hcl:#602927\n" +
            "\n" +
            "byr:2024\n" +
            "eyr:1939 iyr:2020 hgt:140 pid:889951037\n" +
            "hcl:#b6652a ecl:blu\n" +
            "\n" +
            "ecl:amb byr:1942\n" +
            "iyr:2012 pid:161703003 hgt:181cm\n" +
            "eyr:2027 hcl:#602927\n" +
            "\n" +
            "hcl:#18171d\n" +
            "iyr:2015 byr:1935\n" +
            "cid:204\n" +
            "ecl:gry\n" +
            "hgt:180cm eyr:2025 pid:988699528\n" +
            "\n" +
            "eyr:2025 byr:1985\n" +
            "cid:192\n" +
            "hcl:#866857 hgt:150cm pid:315179208 iyr:2010 ecl:blu\n" +
            "\n" +
            "hcl:#341e13 iyr:2013 eyr:2021 cid:62\n" +
            "byr:1928\n" +
            "hgt:168cm pid:862861470 ecl:hzl\n" +
            "\n" +
            "pid:099158408\n" +
            "ecl:grn\n" +
            "eyr:2026 iyr:2018 hcl:#b6652a cid:81\n" +
            "hgt:185cm byr:1964\n" +
            "\n" +
            "byr:1990 hgt:155cm\n" +
            "ecl:brn\n" +
            "eyr:2023\n" +
            "hcl:#ceb3a1 iyr:2012\n" +
            "\n" +
            "ecl:brn\n" +
            "eyr:2026 cid:242 pid:658930205\n" +
            "hgt:176cm byr:1990 iyr:2016 hcl:#d55f68\n" +
            "\n" +
            "hcl:#602927 pid:924899781\n" +
            "eyr:2024 byr:1964\n" +
            "iyr:2019\n" +
            "cid:163\n" +
            "hgt:181cm ecl:gry\n" +
            "\n" +
            "eyr:2026 ecl:blu pid:8812414708 iyr:2017 hcl:#a97842 hgt:190cm\n" +
            "byr:1970\n" +
            "\n" +
            "hgt:152cm\n" +
            "pid:403682313 iyr:2019\n" +
            "hcl:#ceb3a1 ecl:oth\n" +
            "eyr:2021 byr:1957\n" +
            "\n" +
            "pid:23799214\n" +
            "byr:2030 hgt:66cm\n" +
            "iyr:2022\n" +
            "hcl:z ecl:#c806fe eyr:2035\n" +
            "\n" +
            "eyr:2022 hgt:177cm byr:1967 cid:194\n" +
            "pid:060293594\n" +
            "ecl:brn\n" +
            "iyr:2016\n" +
            "hcl:#cfa07d\n" +
            "\n" +
            "hgt:184cm hcl:#6b5442 eyr:2029\n" +
            "ecl:oth iyr:2013 pid:26983291 byr:1965\n" +
            "cid:147\n" +
            "\n" +
            "pid:255519852 byr:1975 hgt:192cm\n" +
            "ecl:lzr\n" +
            "iyr:2015 eyr:2030\n" +
            "hcl:#623a2f\n" +
            "\n" +
            "iyr:2010\n" +
            "ecl:blu\n" +
            "hcl:#881267 hgt:162cm pid:121130250 byr:1935 cid:57 eyr:2025\n" +
            "\n" +
            "hgt:189cm\n" +
            "hcl:#a97842\n" +
            "iyr:2014 eyr:2024\n" +
            "ecl:brn\n" +
            "pid:972960330\n" +
            "\n" +
            "hcl:#623a2f eyr:2026 hgt:193cm cid:87 byr:1982 iyr:2020 pid:158154062 ecl:amb\n" +
            "\n" +
            "eyr:2025 hgt:191cm\n" +
            "ecl:amb\n" +
            "hcl:#341e13\n" +
            "pid:137048981 iyr:2016 byr:1950\n" +
            "\n" +
            "byr:1930 eyr:2029 ecl:hzl hgt:75in\n" +
            "pid:464272185 cid:341\n" +
            "iyr:2012 hcl:#c0946f\n" +
            "\n" +
            "ecl:brn\n" +
            "pid:952709301 byr:1926 hcl:#c0946f\n" +
            "eyr:2028\n" +
            "hgt:170cm\n" +
            "\n" +
            "pid:578940518 byr:2025 hgt:190in\n" +
            "iyr:2030 cid:52 ecl:amb eyr:2027\n" +
            "\n" +
            "ecl:amb hgt:185cm cid:237 iyr:2016 pid:490377510 byr:1950 hcl:#18171d\n" +
            "eyr:2025\n" +
            "\n" +
            "iyr:2014 hgt:156in pid:65952131\n" +
            "ecl:blu byr:1938 hcl:#7d3b0c\n" +
            "eyr:2023\n" +
            "\n" +
            "ecl:gry iyr:2016 pid:818347623 hcl:#888785 eyr:2030 hgt:174cm\n" +
            "\n" +
            "ecl:hzl\n" +
            "hcl:#866857\n" +
            "eyr:2027\n" +
            "pid:213124752 hgt:179cm\n" +
            "byr:1989\n" +
            "\n" +
            "pid:024846371 byr:1990 iyr:2018\n" +
            "eyr:2026 hgt:161cm ecl:oth\n" +
            "\n" +
            "hcl:z hgt:129 iyr:2016\n" +
            "eyr:2034\n" +
            "pid:#b85e75 byr:2026 ecl:oth\n" +
            "\n" +
            "hgt:192cm hcl:#602927 ecl:blu iyr:2011\n" +
            "pid:863613568 byr:1996 eyr:2027\n" +
            "\n" +
            "hgt:160cm cid:229 byr:1952\n" +
            "iyr:2019\n" +
            "ecl:#0ae2d6 eyr:2027 pid:719697407 hcl:z\n" +
            "\n" +
            "pid:040987502 cid:155 iyr:2012 hgt:173cm\n" +
            "byr:2002\n" +
            "hcl:#fffffd eyr:2023 ecl:hzl\n" +
            "\n" +
            "ecl:oth byr:1993 iyr:2019 pid:319157251 hcl:#733820 hgt:70in eyr:2027\n" +
            "\n" +
            "hcl:#9d85d4\n" +
            "hgt:192cm pid:570514935\n" +
            "cid:238 eyr:2022 ecl:gry byr:1989\n" +
            "iyr:2016\n" +
            "\n" +
            "hgt:162cm\n" +
            "cid:201 iyr:2015 eyr:2023 pid:553794028 byr:1922 ecl:amb hcl:#623a2f\n" +
            "\n" +
            "cid:56\n" +
            "eyr:2024 ecl:amb hgt:179cm hcl:#efcc98\n" +
            "pid:665225721\n" +
            "iyr:2012 byr:1963\n" +
            "\n" +
            "byr:2026\n" +
            "hcl:#888785\n" +
            "iyr:1972 eyr:1980 cid:323 pid:153cm\n" +
            "hgt:170cm ecl:blu\n" +
            "\n" +
            "pid:704204892 ecl:gry\n" +
            "eyr:2023\n" +
            "byr:1920 hgt:168cm iyr:2010 hcl:#3311ec\n" +
            "\n" +
            "pid:#7f3caf eyr:2023\n" +
            "hcl:z hgt:146 byr:1990 ecl:amb\n" +
            "iyr:2014 cid:270\n" +
            "\n" +
            "hgt:171cm ecl:blu pid:383695713\n" +
            "cid:200 iyr:2010\n" +
            "hcl:#602927 byr:1950 eyr:2024\n" +
            "\n" +
            "hgt:178cm byr:1935 hcl:#2da7db\n" +
            "pid:597509269\n" +
            "eyr:2020 iyr:2014\n" +
            "ecl:blu\n" +
            "\n" +
            "eyr:2034\n" +
            "ecl:#d4719a\n" +
            "hcl:z hgt:67cm iyr:2023 pid:#268d93 byr:2006\n" +
            "\n" +
            "eyr:1939 pid:9942171839\n" +
            "hgt:104\n" +
            "iyr:1945\n" +
            "byr:2011 ecl:#f9bafb hcl:#ceb3a1\n" +
            "\n" +
            "byr:1937\n" +
            "iyr:2010 pid:979528684\n" +
            "eyr:2028 hcl:#ceb3a1 ecl:gry hgt:164cm\n" +
            "\n" +
            "iyr:2019 eyr:2022 pid:044485658 hcl:#18171d byr:1996 hgt:169cm\n" +
            "ecl:gry\n" +
            "\n" +
            "pid:031482456\n" +
            "eyr:2024\n" +
            "iyr:2015\n" +
            "hgt:157cm hcl:#7d3b0c byr:1921\n" +
            "ecl:oth\n" +
            "\n" +
            "pid:399398768\n" +
            "ecl:lzr\n" +
            "hcl:z\n" +
            "eyr:1983 hgt:68cm\n" +
            "byr:2024 iyr:2027 cid:127\n" +
            "\n" +
            "hgt:186cm eyr:2026 pid:140032921 ecl:amb cid:278\n" +
            "byr:1937 iyr:2015\n" +
            "\n" +
            "hgt:172cm\n" +
            "ecl:amb pid:718725983 hcl:#6b5442 eyr:2024\n" +
            "iyr:2013 byr:1974\n" +
            "\n" +
            "ecl:amb iyr:2014 cid:216 hcl:#cfa07d\n" +
            "eyr:2022 pid:442275714 hgt:68in byr:1999\n" +
            "\n" +
            "hgt:152cm cid:193\n" +
            "iyr:2015 pid:806672342 hcl:#b6652a byr:1927 ecl:oth\n" +
            "\n" +
            "hcl:#7d3b0c byr:1925 iyr:2015 hgt:174cm pid:888044223 cid:168 ecl:oth eyr:2029\n" +
            "\n" +
            "ecl:gry byr:2009 hgt:156cm\n" +
            "hcl:#888785 pid:263500722 iyr:2015 eyr:2021\n" +
            "\n" +
            "cid:103\n" +
            "hcl:#ba8b89 ecl:hzl hgt:169cm\n" +
            "byr:1929 pid:626102979 iyr:2016 eyr:2028\n" +
            "\n" +
            "iyr:2016 hgt:188cm cid:133\n" +
            "byr:1926 ecl:hzl eyr:2023 hcl:#602927 pid:678092780\n" +
            "\n" +
            "ecl:utc byr:2025 pid:#584dc1 eyr:2037\n" +
            "hgt:151cm iyr:1950 hcl:#cfa07d\n" +
            "\n" +
            "ecl:oth hgt:140 eyr:1977 hcl:#6b5442 iyr:1955\n" +
            "byr:1999\n" +
            "pid:868434068\n" +
            "\n" +
            "eyr:2029 hcl:#18171d cid:158 iyr:2016 hgt:166cm ecl:hzl\n" +
            "pid:100226690 byr:1942\n" +
            "\n" +
            "ecl:#806ce8\n" +
            "cid:153 iyr:2024 byr:1985 hcl:da8a68\n" +
            "pid:#d9e5b0 eyr:2017\n" +
            "\n" +
            "eyr:2020 hgt:164cm cid:222 ecl:hzl byr:1945 hcl:#cfa07d\n" +
            "iyr:2011\n" +
            "\n" +
            "iyr:2018 hgt:165cm\n" +
            "pid:868536448 eyr:2026 byr:1930\n" +
            "ecl:hzl hcl:#623a2f cid:128\n" +
            "\n" +
            "ecl:grn iyr:2012\n" +
            "cid:326 byr:1950 hcl:#efcc98 eyr:2029 hgt:177cm pid:685629972\n" +
            "\n" +
            "byr:2004 hgt:168cm\n" +
            "ecl:dne iyr:2020 hcl:z\n" +
            "\n" +
            "byr:1964 pid:132604237 ecl:oth hcl:#602927 hgt:188cm\n" +
            "cid:78\n" +
            "iyr:2012 eyr:2025\n" +
            "\n" +
            "byr:1945\n" +
            "iyr:2023 ecl:#1a590c hgt:70in\n" +
            "pid:186cm eyr:2031 hcl:z\n" +
            "\n" +
            "cid:178\n" +
            "ecl:amb eyr:2024 hgt:162cm\n" +
            "hcl:#18171d iyr:2016\n" +
            "byr:1945 pid:737813370\n" +
            "\n" +
            "hcl:#18171d\n" +
            "byr:1949\n" +
            "pid:064917719\n" +
            "hgt:176cm ecl:amb\n" +
            "eyr:2034\n" +
            "iyr:1998\n" +
            "\n" +
            "hgt:72in\n" +
            "pid:711343766 hcl:#623a2f\n" +
            "iyr:2010 byr:1977 ecl:amb cid:177 eyr:2023\n" +
            "\n" +
            "byr:1933 hgt:66 pid:22149379 eyr:2040\n" +
            "ecl:#92d7a7 hcl:#cfa07d\n" +
            "\n" +
            "iyr:2020 byr:1946 eyr:2020 ecl:hzl pid:153cm\n" +
            "hgt:159cm cid:261 hcl:#888785\n" +
            "\n" +
            "iyr:2013 byr:1931\n" +
            "ecl:#2ced2e hcl:3c49c1 eyr:1950\n" +
            "hgt:182cm cid:133 pid:#19fc55\n" +
            "\n" +
            "hcl:#a9abe6\n" +
            "iyr:2016\n" +
            "eyr:2029 ecl:hzl cid:343 pid:691253232 byr:1952 hgt:187cm\n" +
            "\n" +
            "hcl:z\n" +
            "eyr:1964\n" +
            "ecl:#5995e6\n" +
            "byr:2021 hgt:72in pid:2103603035 iyr:1951\n" +
            "\n" +
            "iyr:2024 hgt:151in byr:1988 ecl:blu\n" +
            "eyr:1961 cid:117\n" +
            "hcl:z pid:5371118784\n" +
            "\n" +
            "hgt:71cm iyr:2021\n" +
            "eyr:2033 ecl:amb\n" +
            "hcl:z cid:202\n" +
            "pid:207141921 byr:1987\n" +
            "\n" +
            "ecl:gry byr:1927 eyr:2024\n" +
            "hgt:60in iyr:2014\n" +
            "pid:847799723 cid:285\n" +
            "hcl:#733820\n" +
            "\n" +
            "eyr:2022 hcl:#18171d\n" +
            "pid:847063261\n" +
            "byr:1926 ecl:grn\n" +
            "iyr:2011\n" +
            "\n" +
            "pid:647225630 iyr:2016 hcl:#a97842 ecl:oth eyr:2025\n" +
            "cid:144 hgt:182cm byr:1983\n" +
            "\n" +
            "hgt:150 byr:1924\n" +
            "eyr:2024 hcl:1600da\n" +
            "ecl:brn\n" +
            "cid:168 pid:656253964\n" +
            "\n" +
            "hgt:153in pid:644514788 byr:1956 hcl:#866857\n" +
            "iyr:2029\n" +
            "ecl:utc\n" +
            "\n" +
            "cid:57 pid:755541617 byr:1961\n" +
            "iyr:2019\n" +
            "ecl:grn\n" +
            "hgt:169cm hcl:#efcc98 eyr:2029\n" +
            "\n" +
            "iyr:2005\n" +
            "eyr:2040 hcl:8080a4 byr:2013 pid:145803668\n" +
            "\n" +
            "iyr:2029\n" +
            "hcl:z ecl:brn\n" +
            "byr:1948\n" +
            "hgt:76cm pid:186cm eyr:2031\n" +
            "\n" +
            "hcl:#888785 ecl:grn byr:1983 cid:268 pid:402246959 iyr:2018\n" +
            "eyr:2020\n" +
            "\n" +
            "hgt:175cm eyr:2026 pid:594997236\n" +
            "byr:1991 hcl:#ceb3a1 iyr:2015 ecl:blu\n" +
            "\n" +
            "byr:1989\n" +
            "eyr:2027\n" +
            "iyr:2020 hgt:192cm ecl:blu hcl:#cfa07d cid:61 pid:657979353\n" +
            "\n" +
            "pid:#a043a3 iyr:2016 byr:1947\n" +
            "eyr:2031 hgt:191cm ecl:xry\n" +
            "\n" +
            "eyr:2023 ecl:blu byr:1948 cid:128 hgt:74in\n" +
            "pid:966094274\n" +
            "iyr:2015\n" +
            "\n" +
            "iyr:2020 ecl:zzz\n" +
            "eyr:1999 hcl:3cf716 byr:2017 cid:343 pid:60198759\n" +
            "hgt:70cm\n" +
            "\n" +
            "hgt:182 pid:80897411 byr:2014 eyr:2033 iyr:1941 ecl:#9c54e8 cid:107\n" +
            "hcl:z\n" +
            "\n" +
            "iyr:2015 hcl:#866857 byr:1990 cid:167 pid:588340506 eyr:2030 hgt:168cm ecl:oth\n" +
            "\n" +
            "hcl:676aad hgt:151 cid:192 eyr:1930 ecl:oth byr:2012\n" +
            "pid:513365039\n" +
            "iyr:1943\n" +
            "\n" +
            "cid:119\n" +
            "ecl:#921980 hgt:70cm\n" +
            "eyr:2024 hcl:4909ee pid:#13fe6c iyr:2022 byr:2014\n" +
            "\n" +
            "eyr:2036 hcl:02fdbc hgt:155cm\n" +
            "iyr:1946\n" +
            "pid:508011940 ecl:utc byr:2025\n" +
            "\n" +
            "pid:#f74bbe eyr:2028 hcl:#c0946f hgt:171cm ecl:#9077c0\n" +
            "byr:1951 iyr:2010\n" +
            "\n" +
            "iyr:2017 hgt:125 hcl:#cfa07d pid:731062033 ecl:brn eyr:2028 cid:255 byr:2020\n" +
            "\n" +
            "ecl:xry eyr:2033 byr:1978\n" +
            "iyr:2012 hgt:70cm hcl:z\n" +
            "pid:272848084\n" +
            "\n" +
            "ecl:blu hgt:174cm\n" +
            "eyr:2030 byr:1999 hcl:#ceb3a1 iyr:2015\n" +
            "pid:322583115 cid:301\n" +
            "\n" +
            "eyr:2007 byr:2007\n" +
            "ecl:dne cid:322 pid:182cm iyr:2013 hgt:156in\n" +
            "hcl:680e8c\n" +
            "\n" +
            "hgt:189cm hcl:#18171d\n" +
            "byr:1996 ecl:amb\n" +
            "eyr:2022 iyr:2020 pid:470853813\n" +
            "\n" +
            "pid:785152983 iyr:2014 eyr:2028 hcl:#d50ced ecl:hzl byr:1998\n" +
            "\n" +
            "ecl:hzl byr:1945 hcl:#7d3b0c cid:164 hgt:187cm pid:414181589 iyr:2018\n" +
            "\n" +
            "byr:1936\n" +
            "hgt:183cm ecl:gry pid:376279728 hcl:#7d3b0c\n" +
            "eyr:2023 iyr:2012\n" +
            "\n" +
            "byr:2000 hgt:157cm\n" +
            "ecl:hzl\n" +
            "iyr:2020\n" +
            "pid:203994583\n" +
            "eyr:2023 hcl:#866857\n" +
            "\n" +
            "eyr:1992 byr:2009\n" +
            "iyr:2029\n" +
            "hcl:dc80b3 hgt:70cm ecl:grn pid:#65c31d\n" +
            "\n" +
            "hcl:#7d3b0c\n" +
            "byr:1945\n" +
            "hgt:177cm\n" +
            "iyr:2013 eyr:2028 pid:038116668 cid:74 ecl:blu\n" +
            "\n" +
            "pid:700997508 eyr:1970 ecl:zzz hcl:#888785 iyr:2013 byr:1986 cid:219 hgt:76cm\n" +
            "\n" +
            "eyr:2025 hgt:161cm\n" +
            "iyr:2015 cid:188\n" +
            "hcl:#fffffd\n" +
            "pid:840085402 ecl:gry byr:1988\n" +
            "\n" +
            "pid:96550914 hcl:#481a3b byr:1997 ecl:#a57167\n" +
            "cid:274 hgt:174cm\n" +
            "\n" +
            "hcl:#b6652a\n" +
            "ecl:brn eyr:2029\n" +
            "hgt:157cm iyr:2011 pid:910022061\n" +
            "byr:1947 cid:273\n" +
            "\n" +
            "pid:010289131 eyr:2026\n" +
            "byr:1930\n" +
            "hcl:#b6652a ecl:grn\n" +
            "cid:220 hgt:187cm iyr:2013\n" +
            "\n" +
            "hcl:#6b5442 ecl:grt hgt:120\n" +
            "pid:454504291 eyr:1933 byr:2025 iyr:1930\n" +
            "\n" +
            "iyr:2016\n" +
            "hgt:180cm ecl:amb eyr:2028 cid:237\n" +
            "pid:334803890 byr:1953 hcl:#18171d\n" +
            "\n" +
            "eyr:2020 byr:2002 hcl:#c54f21\n" +
            "iyr:2019 ecl:blu hgt:180cm cid:138\n" +
            "\n" +
            "byr:1933\n" +
            "iyr:2020\n" +
            "ecl:brn hgt:185cm\n" +
            "hcl:#c0946f\n" +
            "eyr:2020 pid:050791974\n" +
            "\n" +
            "byr:1933 ecl:brn hgt:186cm\n" +
            "pid:643899463 eyr:2030 iyr:2019\n" +
            "hcl:#866857\n" +
            "\n" +
            "iyr:2018 byr:1935 ecl:oth\n" +
            "eyr:2029\n" +
            "pid:732801213 hcl:#6b5442 hgt:169cm\n" +
            "\n" +
            "eyr:2020\n" +
            "hcl:z byr:1996\n" +
            "ecl:#4102ee\n" +
            "pid:890541531 hgt:193cm iyr:2014\n" +
            "\n" +
            "pid:618379341 ecl:gry hcl:#18171d byr:1991 eyr:2025 hgt:154cm iyr:2019\n" +
            "\n" +
            "iyr:2013\n" +
            "pid:912066964 ecl:grn eyr:2040 hgt:192cm byr:1974\n" +
            "hcl:#18171d\n" +
            "\n" +
            "eyr:2025 cid:167 hgt:192cm\n" +
            "pid:678328147 ecl:gry\n" +
            "hcl:#18171d iyr:2017\n" +
            "\n" +
            "iyr:2011 byr:2021 hgt:189cm ecl:gmt hcl:z eyr:2035 pid:278839955\n" +
            "\n" +
            "eyr:2030 hcl:#efcc98\n" +
            "ecl:blu iyr:2011\n" +
            "pid:536958012 hgt:192cm byr:2002\n" +
            "\n" +
            "pid:#1306f2 byr:1976\n" +
            "hcl:#790688 hgt:158cm ecl:grn eyr:2024 iyr:2019\n" +
            "\n" +
            "eyr:2030 hcl:#866857\n" +
            "cid:50 ecl:oth pid:421235317\n" +
            "iyr:2014 hgt:60in\n" +
            "\n" +
            "iyr:2020 byr:1971 cid:124\n" +
            "pid:319896110 ecl:oth hcl:#fffffd\n" +
            "\n" +
            "cid:143\n" +
            "eyr:2021 hgt:190cm pid:366021385 hcl:#18171d ecl:amb byr:1934\n" +
            "iyr:2016\n" +
            "\n" +
            "hgt:169cm hcl:#602927 pid:177cm\n" +
            "eyr:2022 byr:2020 ecl:#dd96f4 iyr:2014\n" +
            "\n" +
            "eyr:2020 hgt:173cm pid:591592395 ecl:oth byr:1966\n" +
            "hcl:#c0946f iyr:2020\n" +
            "\n" +
            "pid:282088832 ecl:gmt\n" +
            "hgt:167in byr:2016 hcl:z\n" +
            "iyr:2018\n" +
            "\n" +
            "iyr:2016\n" +
            "hgt:62in hcl:#c0946f\n" +
            "pid:306204399 eyr:2020 ecl:brn\n" +
            "byr:1999\n" +
            "\n" +
            "eyr:1947 byr:1984 pid:595671246 hcl:3d50e7 ecl:xry iyr:1947\n" +
            "\n" +
            "hgt:187cm\n" +
            "eyr:2024 pid:477011496\n" +
            "byr:1971\n" +
            "hcl:#733820\n" +
            "iyr:2010\n" +
            "ecl:brn cid:165\n" +
            "\n" +
            "byr:2023\n" +
            "pid:173cm\n" +
            "hgt:193in eyr:2019 cid:102 ecl:grt hcl:#c0946f\n" +
            "\n" +
            "pid:195062251\n" +
            "iyr:2027\n" +
            "cid:138 byr:2021 ecl:brn eyr:2025 hgt:60in\n" +
            "\n" +
            "hgt:71cm hcl:z\n" +
            "ecl:utc\n" +
            "eyr:2021 iyr:1925 pid:5469028726 byr:2017\n" +
            "\n" +
            "hcl:#b6652a hgt:168cm\n" +
            "byr:1960 ecl:grn\n" +
            "pid:653140418\n" +
            "iyr:2014 eyr:2023\n" +
            "\n" +
            "pid:#afa892 cid:190 hcl:z\n" +
            "hgt:189cm\n" +
            "eyr:2020 ecl:gry\n" +
            "byr:2003\n" +
            "iyr:1956\n" +
            "\n" +
            "hcl:e4cddf cid:185 pid:189cm hgt:175cm\n" +
            "byr:2016 iyr:2010 ecl:#fa945d eyr:1947\n" +
            "\n" +
            "cid:176\n" +
            "hcl:7752f8 eyr:2039 byr:2019 ecl:hzl iyr:2029 hgt:185cm pid:636534364\n" +
            "\n" +
            "cid:170 ecl:gmt hcl:ef5177 byr:2021\n" +
            "eyr:1993\n" +
            "hgt:71cm pid:2136295 iyr:2013\n" +
            "\n" +
            "byr:2028 pid:156cm hcl:d74b86 cid:238\n" +
            "hgt:89\n" +
            "iyr:1957 eyr:1937\n" +
            "\n" +
            "eyr:2030 byr:1932 hcl:#c0946f cid:349\n" +
            "hgt:177cm\n" +
            "ecl:grn iyr:2016\n" +
            "\n" +
            "hcl:z byr:2003\n" +
            "ecl:#9b98b2 hgt:81 pid:13338103 eyr:2040\n" +
            "\n" +
            "iyr:2018 pid:801432704 hgt:73in byr:1964 cid:298 hcl:#fffffd ecl:amb eyr:2030\n" +
            "\n" +
            "cid:272\n" +
            "iyr:2019 pid:369160624 byr:1929 hgt:184cm eyr:2025 hcl:#ceb3a1 ecl:blu\n" +
            "\n" +
            "hcl:#7d3b0c pid:525287934\n" +
            "byr:1998 eyr:2027\n" +
            "iyr:2017 hgt:168cm ecl:gry\n" +
            "\n" +
            "byr:1975 eyr:2027\n" +
            "ecl:brn cid:125 hcl:4e319d\n" +
            "hgt:172cm pid:308046532 iyr:2017\n" +
            "\n" +
            "hcl:b889c0 pid:6699675552 byr:2019 iyr:1968\n" +
            "ecl:gmt\n" +
            "eyr:2003\n" +
            "hgt:180in\n" +
            "\n" +
            "byr:2025\n" +
            "ecl:zzz hgt:162in hcl:z iyr:2002 pid:#87dca4 eyr:1951\n" +
            "\n" +
            "eyr:2022\n" +
            "pid:549517742 ecl:hzl\n" +
            "iyr:2026\n" +
            "byr:2029 hgt:153cm hcl:2993de\n" +
            "\n" +
            "eyr:2024\n" +
            "pid:755674604 iyr:2018 hcl:#c0946f\n" +
            "ecl:gry byr:1966\n" +
            "hgt:188cm\n" +
            "\n" +
            "pid:665375893 iyr:2017\n" +
            "byr:1997\n" +
            "eyr:2029 hgt:173cm ecl:gry\n" +
            "\n" +
            "hcl:#6b5442 hgt:74cm ecl:#0dc7f6\n" +
            "pid:451038742 eyr:1982 byr:1939\n" +
            "iyr:1932\n" +
            "\n" +
            "hcl:#18171d\n" +
            "byr:1980 ecl:gry\n" +
            "iyr:2019 hgt:167cm\n" +
            "pid:326267989 eyr:2028\n" +
            "\n" +
            "cid:226 hgt:177cm ecl:hzl hcl:#a97842 eyr:2025\n" +
            "iyr:2013\n" +
            "byr:1949 pid:292166795\n" +
            "\n" +
            "ecl:oth pid:962521763\n" +
            "iyr:2013 cid:71 eyr:2022 hgt:193cm hcl:#18171d byr:1969\n" +
            "\n" +
            "ecl:grn iyr:2028 eyr:2024\n" +
            "hgt:189cm hcl:z byr:1940 pid:032392876\n" +
            "\n" +
            "iyr:2012 hgt:191cm cid:339 ecl:oth eyr:2028 pid:392810631 hcl:#b6652a byr:1959\n" +
            "\n" +
            "iyr:2011 byr:1975\n" +
            "eyr:2027\n" +
            "hcl:#18171d\n" +
            "hgt:176cm\n" +
            "ecl:gry pid:290432747\n" +
            "\n" +
            "cid:180 ecl:brn pid:210871734 eyr:2027\n" +
            "byr:1946 hcl:z hgt:185cm iyr:2011\n" +
            "\n" +
            "byr:1924 ecl:grt\n" +
            "eyr:2028 hgt:187cm pid:#608f4f\n" +
            "\n" +
            "eyr:2022 ecl:#a05063 byr:1926 hcl:#7d3b0c pid:3292990618 hgt:183in iyr:2021\n" +
            "\n" +
            "ecl:#a8b66c\n" +
            "iyr:1942 eyr:1960 hgt:60cm byr:2027 pid:#3b6f3f hcl:9fae56\n" +
            "\n" +
            "hgt:183cm\n" +
            "ecl:oth hcl:#c0946f pid:816986054 eyr:2020 iyr:2014 byr:1935\n" +
            "\n" +
            "hgt:174 byr:2008\n" +
            "iyr:2029 hcl:9259e7 pid:85036214 ecl:gmt\n" +
            "\n" +
            "cid:85\n" +
            "pid:032040868\n" +
            "byr:2001 eyr:2027 hcl:#c0946f ecl:grn iyr:2020\n" +
            "hgt:173cm\n" +
            "\n" +
            "hcl:#6b5442\n" +
            "cid:308\n" +
            "ecl:grt iyr:1939 byr:2009\n" +
            "pid:9365125584 eyr:2031 hgt:67cm\n" +
            "\n" +
            "hgt:154cm\n" +
            "byr:1936\n" +
            "eyr:2030 hcl:491c70 pid:391887956 iyr:2029 ecl:blu\n" +
            "\n" +
            "hcl:#866857\n" +
            "hgt:161cm cid:76 pid:921202500 eyr:2021 ecl:brn byr:1968\n" +
            "\n" +
            "iyr:2024 ecl:dne hcl:z pid:8054447805 hgt:154 eyr:2035 byr:2024\n" +
            "\n" +
            "hcl:#0a524b pid:667928918\n" +
            "eyr:2025\n" +
            "cid:245 ecl:brn byr:1973 hgt:179cm\n" +
            "\n" +
            "ecl:gry hgt:68in pid:322837855 eyr:2023\n" +
            "cid:323 byr:1944\n" +
            "iyr:2012\n" +
            "\n" +
            "byr:1940\n" +
            "hgt:178cm ecl:hzl hcl:#c0946f iyr:2030\n" +
            "eyr:2020 pid:788531859\n" +
            "\n" +
            "cid:253 iyr:2012 hgt:163cm\n" +
            "pid:554364568 eyr:2025 byr:1976 ecl:grn hcl:#888785\n" +
            "\n" +
            "hcl:#efcc98 iyr:2015 ecl:gry eyr:2029 pid:273847553 cid:274\n" +
            "hgt:68in byr:1933\n" +
            "\n" +
            "hgt:165cm\n" +
            "pid:209462386 eyr:2024\n" +
            "byr:1969 hcl:#733820 ecl:grn\n" +
            "iyr:2020\n" +
            "\n" +
            "byr:1975 hgt:187cm eyr:2027 iyr:2018 hcl:#c0946f ecl:hzl pid:141969110\n" +
            "\n" +
            "hcl:z pid:534439483 iyr:2022 ecl:grt eyr:2036 hgt:164in cid:324\n" +
            "byr:2025\n" +
            "\n" +
            "hcl:#74ca66\n" +
            "iyr:2011\n" +
            "pid:253012158\n" +
            "hgt:188cm\n" +
            "cid:246 ecl:oth eyr:2023\n" +
            "\n" +
            "byr:2020 pid:56939101 hcl:9f5f65\n" +
            "eyr:1949\n" +
            "iyr:2021 hgt:155in\n" +
            "\n" +
            "iyr:2020 hgt:174cm cid:304\n" +
            "byr:1944\n" +
            "eyr:2028 hcl:#733820\n" +
            "\n" +
            "hcl:#866857 ecl:gry eyr:2030 iyr:2014 hgt:63in byr:1997\n" +
            "pid:371522079\n" +
            "\n" +
            "ecl:amb\n" +
            "byr:1955 iyr:2013\n" +
            "hcl:#888785 cid:265 eyr:2026 hgt:190cm pid:311393763\n" +
            "\n" +
            "eyr:2026 iyr:2019\n" +
            "pid:721355771 byr:1947\n" +
            "hcl:#733820\n" +
            "hgt:71in ecl:gry\n" +
            "\n" +
            "cid:94 eyr:2024 byr:1938 pid:336868233 ecl:hzl\n" +
            "iyr:2012\n" +
            "hgt:177cm hcl:#7d3b0c\n" +
            "\n" +
            "ecl:brn iyr:2010\n" +
            "eyr:2027\n" +
            "pid:379769214\n" +
            "cid:111 byr:1960 hcl:#cfa07d hgt:169cm\n" +
            "\n" +
            "hgt:179cm\n" +
            "hcl:3f59a6 eyr:2036 byr:2025 ecl:oth pid:217404607\n" +
            "iyr:2018\n" +
            "\n" +
            "ecl:amb pid:820370865 hgt:170cm iyr:2012 byr:1967 hcl:#efcc98 cid:309 eyr:2025\n" +
            "\n" +
            "byr:1940\n" +
            "pid:008495978 ecl:gry hgt:159cm hcl:#602927 eyr:2024\n" +
            "\n" +
            "hgt:186cm\n" +
            "byr:1971 pid:556900517 cid:334 hcl:#efcc98 ecl:brn\n" +
            "iyr:2014\n" +
            "\n" +
            "iyr:2020 byr:1928\n" +
            "cid:200 hgt:193cm\n" +
            "ecl:grn hcl:#7d3b0c\n" +
            "\n" +
            "cid:233\n" +
            "hcl:a3046e pid:626863952 ecl:lzr iyr:2029 eyr:2024 byr:2000 hgt:193cm\n" +
            "\n" +
            "cid:244\n" +
            "hcl:#866857 ecl:amb byr:1931\n" +
            "eyr:1928 pid:557376401 hgt:182cm iyr:2013";
}
