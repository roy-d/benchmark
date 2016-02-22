# benchmark

```
sbt "jmh:run -i 5 -wi 5 -f1 -t1 HelperBenchmark.*"
```

```
[info] # Run complete. Total time: 00:00:22
[info]
[info] Benchmark                 Mode  Cnt   Score    Error  Units
[info] HelperBenchmark.badMax   thrpt    5  21.494 ± 10.980  ops/s
[info] HelperBenchmark.goodMax  thrpt    5  53.207 ± 17.673  ops/s
[success] Total time: 24 s, completed Feb 21, 2016 11:31:30 PM
```
