root_dir := justfile_directory()

build: clean
    cd {{ root_dir }}/sampleapp && ./gradlew clean assembleDebug
    apktool d --no-res {{ root_dir }}/sampleapp/app/build/outputs/apk/debug/app-debug.apk -o {{ root_dir }}/tmp
    find {{ root_dir }}/tmp -name "RexLogger.smali" -exec cp "{}" {{ root_dir }} \;
    rm -rf {{ root_dir }}/tmp

clean:
    rm -rf {{ root_dir }}/tmp
