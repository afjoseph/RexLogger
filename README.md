# RexLogger

Add `RexLogger.smali` to a decompiled app to inject logs in the app. For more info on instructions, see `RexLogger.java`

# Usage
- Make a directory called `rex` in the `smali` directory on the decompiled app.
- Put `RexLogger.smali` in the newly created `rex` directory.
- Look up the smali reference for each function you wanna call in `RexLogger.java`. 

An example invocation would be something like:
```smali
    invoke-static {}, LRexLogger;->d()I
```

Printing a stacktrace would look like this:

```smali
    invoke-static {}, LRexLogger;->stacktrace()I
```

# Building `RexLogger.smali`
From what I see [here](https://stackoverflow.com/questions/29051781/convert-java-file-to-smali-file), there's a proper way to convert a `.java` file to `.smali`. The way I made it was a bit longer: I made an example app, decompiled it with `apktool` and extracted the `.smali` file. `apktool` uses `baksmali` internally, so the process was the same.
