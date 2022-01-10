SRCS= $(wildcard *.java)
CLASSES = $(SRCS:.java=.class)
JC= javac

all: $(CLASSES)
	@echo Finished making all
$(CLASSES): $(SRCS)
	$(JC) $(SRCS)
clean:
	$(RM) $(CLASSES)
