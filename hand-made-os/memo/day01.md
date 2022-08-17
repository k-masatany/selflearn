# memo

exFAT: x
FAT32: o

# Commands

sudo mkdir -p /mnt/usbmem
sudo mount -t drvfs H: /mnt/usbmem/
sudo mkdir -p /mnt/usbmem/EFI/BOOT
sudo cp repositories/github.com/selflearn/hand-made-os/BOOTX64.EFI /mnt/usbmem/EFI/BOOT/
sudo umount /mnt/usbmem
sudo mkdir -p /mnt/usbmem
