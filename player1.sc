s.boot;
s.quit;

SynthDef(\pbuf2, {arg buf, out=0, amp=1.0;
  var sig=PlayBuf.ar(2,buf,doneAction:2);
  Out.ar(0,amp*sig);
}).send;

b=Buffer.read(s,"sounds/TheEphemeralBluebell.flac", action: _.query);

Synth(\pbuf2, [\buf, b]);
