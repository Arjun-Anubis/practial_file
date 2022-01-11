SRCS= $(wildcard src/*.java)
BUILDDIR= build/
CLASSES = $(SRCS:.java=.class)
JOPTIONS= -d build
JC= javac

all: $(CLASSES)
	@echo Finished making all

%.class: %.java
	$(JC) $< $(JOPTIONS)

clean:
	$(RM) $(BUILDDIR)*.class
