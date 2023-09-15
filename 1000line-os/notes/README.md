- Ubuntu で実装
  - sudo apt update && sudo apt install -y clang llvm lld qemu-system-riscv32 curl
  - curl -LO https://github.com/qemu/qemu/raw/v8.0.4/pc-bios/opensbi-riscv32-generic-fw_dynamic.bin
    - 利用している qemu のバージョンに応じた bios をダウンロードしないと動かない
  - 基本的にはテキスト通りの指示に従ってコマンドを実行

- LLVM と Qemu を利用
