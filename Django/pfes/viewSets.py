from rest_framework import viewsets
from pfes.serializer import TypeSerializer, PfeSerializer, PfeSecondSerializer
from pfes.models import Type, Pfe
from rest_framework.response import Response


class TypeViewSet(viewsets.ModelViewSet):
    queryset = Type.objects.all()
    serializer_class = TypeSerializer


class PfeViewSet(viewsets.ModelViewSet):
    queryset = Pfe.objects.all()
    serializer_class = PfeSerializer

    def get_serializer_class(self):
        """
        Return the serializer instance that should be used for validating and
        deserializing input, and for serializing output.
        """
        if (self.action == "create") | (self.action == "update"):
            return PfeSecondSerializer
        return PfeSerializer
