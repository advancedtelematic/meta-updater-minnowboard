DESCRIPTION = "startup.nsh for minnowboard using grub"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

COMPATIBLE_MACHINE = "intel-corei7-64"
ALLOW_EMPTY_${PN} = "1"

inherit deploy

do_deploy() {
    echo 'fs0:\\EFI\\BOOT\\bootx64.efi' > ${DEPLOYDIR}/startup.nsh
}

addtask do_deploy
